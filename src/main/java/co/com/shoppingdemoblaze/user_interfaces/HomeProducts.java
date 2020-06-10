package co.com.shoppingdemoblaze.user_interfaces;

import static net.serenitybdd.screenplay.targets.Target.the;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomeProducts extends PageObject {

  public static final Target CATEGORIES =
      the("Title of the product to buy").locatedBy("//a[@onclick=\"byCat('{0}')\"]");
  public static final Target DEVICE_NAME =
      the("Name of the device to buy")
          .locatedBy("//div[@id = 'tbodyid']//a[contains(text(),'{0}')]");
  public static final Target MENU_OPTION =
      the("Main menu option").locatedBy("//a[contains(text(), '{0}')]");
}
