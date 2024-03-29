package co.com.shoppingdemoblaze.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmOrderPage {

  public static final Target LBL_ORDER_CONFIRMATION =
      Target.the("Label confirmation message")
          .located(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]"));
}
