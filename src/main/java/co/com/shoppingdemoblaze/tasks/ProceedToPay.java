package co.com.shoppingdemoblaze.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.shoppingdemoblaze.user_interfaces.DetailProductsPay;
import co.com.shoppingdemoblaze.user_interfaces.FormPlaceOrder;
import co.com.shoppingdemoblaze.utils.Constants;
import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ProceedToPay implements Task {

  private List<Map<String, String>> personalInformation;

  public ProceedToPay(List<Map<String, String>> personalInformation) {
    this.personalInformation = personalInformation;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        WaitUntil.the(DetailProductsPay.LBL_TOTAL_ORDER, isVisible()),
        Click.on(DetailProductsPay.BTN_PLACE_ORDER),
        Enter.theValue(personalInformation.get(0).get("Name"))
            .into(FormPlaceOrder.FIELDS_FORM.of(Constants.FORM_NAME)),
        Enter.theValue(personalInformation.get(0).get("Country"))
            .into(FormPlaceOrder.FIELDS_FORM.of(Constants.FORM_COUNTRY)),
        Enter.theValue(personalInformation.get(0).get("City"))
            .into(FormPlaceOrder.FIELDS_FORM.of(Constants.FORM_CITY)),
        Enter.theValue(personalInformation.get(0).get("Credit_card"))
            .into(FormPlaceOrder.FIELDS_FORM.of(Constants.FORM_CARD)),
        Enter.theValue(personalInformation.get(0).get("Month"))
            .into(FormPlaceOrder.FIELDS_FORM.of(Constants.FORM_MONTH)),
        Enter.theValue(personalInformation.get(0).get("Year"))
            .into(FormPlaceOrder.FIELDS_FORM.of(Constants.FORM_YEAR)),
        Click.on(FormPlaceOrder.BTN_PURCHASE));
  }

  public static Performable placeOrder(List<Map<String, String>> personalInformation) {
    return instrumented(ProceedToPay.class, personalInformation);
  }
}
