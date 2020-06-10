package co.com.shoppingdemoblaze.tasks;

import static co.com.shoppingdemoblaze.user_interfaces.ProductDescription.BTN_ADD_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.shoppingdemoblaze.user_interfaces.HomeProducts;
import co.com.shoppingdemoblaze.utils.Constants;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AddToCart implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(BTN_ADD_CART));
    try {
      Thread.sleep(2000);
      WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
      Alert alert = driver.switchTo().alert();
      alert.accept();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    actor.attemptsTo(Click.on(HomeProducts.MENU_OPTION.of(Constants.OPTION_CART)));
  }

  public static Performable toBuyDevice() {
    return instrumented(AddToCart.class);
  }
}
