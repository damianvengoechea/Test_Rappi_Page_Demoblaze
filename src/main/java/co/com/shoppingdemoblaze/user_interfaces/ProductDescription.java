package co.com.shoppingdemoblaze.user_interfaces;

import static net.serenitybdd.screenplay.targets.Target.the;

import net.serenitybdd.screenplay.targets.Target;

public class ProductDescription {

  public static final Target BTN_ADD_CART =
      the("Button add to cart the product of buy")
          .locatedBy("//a[@class='btn btn-success btn-lg']");
}
