package co.com.shoppingdemoblaze.user_interfaces;

import static net.serenitybdd.screenplay.targets.Target.the;

import net.serenitybdd.screenplay.targets.Target;

public class FormPlaceOrder {
  public static final Target FIELDS_FORM = the("Field to form").locatedBy("//input[@id='{0}']");
  public static final Target BTN_PURCHASE =
      the("Button purchase").locatedBy("//button[contains(text(),'Purchase')]");
}
