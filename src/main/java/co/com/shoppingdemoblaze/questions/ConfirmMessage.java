package co.com.shoppingdemoblaze.questions;

import co.com.shoppingdemoblaze.user_interfaces.ConfirmOrderPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConfirmMessage implements Question<String> {

  public String message;

  @Override
  public String answeredBy(Actor actor) {
    message = ConfirmOrderPage.LBL_ORDER_CONFIRMATION.resolveFor(actor).getText();
    return message;
  }

  public static ConfirmMessage expectedMessage() {
    return new ConfirmMessage();
  }
}
