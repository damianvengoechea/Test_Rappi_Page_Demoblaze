package co.com.shoppingdemoblaze.tasks;

import static co.com.shoppingdemoblaze.user_interfaces.HomeProducts.CATEGORIES;
import static co.com.shoppingdemoblaze.user_interfaces.HomeProducts.DEVICE_NAME;
import static co.com.shoppingdemoblaze.utils.Constants.CATEGORY_LAPTOP;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectProduct implements Task {

  private String deviceName;

  public SelectProduct(String deviceName) {
    this.deviceName = deviceName;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(CATEGORIES.of(CATEGORY_LAPTOP)), Click.on(DEVICE_NAME.of(deviceName)));
  }

  public static Performable selectProductToBuy(String deviceName) {
    return instrumented(SelectProduct.class, deviceName);
  }
}
