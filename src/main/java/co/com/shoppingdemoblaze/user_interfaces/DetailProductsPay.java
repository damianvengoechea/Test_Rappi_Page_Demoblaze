package co.com.shoppingdemoblaze.user_interfaces;

import static net.serenitybdd.screenplay.targets.Target.the;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetailProductsPay {
  public static final Target BTN_PLACE_ORDER =
      the("Button place order").locatedBy("//button[@class='btn btn-success']");
  public static final Target LBL_TOTAL_ORDER = the("Label total order").located(By.id("totalp"));
}
