package co.com.shoppingdemoblaze.stepdefinitions;

import static co.com.shoppingdemoblaze.tasks.SelectProduct.selectProductToBuy;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import co.com.shoppingdemoblaze.interactions.OpenBrowser;
import co.com.shoppingdemoblaze.questions.ConfirmMessage;
import co.com.shoppingdemoblaze.tasks.AddToCart;
import co.com.shoppingdemoblaze.tasks.ProceedToPay;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BuyLaptopStepDefinition {

  @Before
  public void prepareStage() {
    OnStage.setTheStage(new OnlineCast());
  }

  @Given("^that (.*) selects the following (.*)$")
  public void thatDamianSelectsTheFollowingLaptop(String nameActor, String device) {
    theActorCalled(nameActor).wasAbleTo(OpenBrowser.withSpecificUrl(), selectProductToBuy(device));
  }

  @When("^he add to the cart$")
  public void heAddToTheCart() {
    theActorInTheSpotlight().attemptsTo(AddToCart.toBuyDevice());
  }

  @When("^start pay place order with next data$")
  public void startPayPlaceOrderWithNextData(List<Map<String, String>> personalInformation) {
    theActorInTheSpotlight().attemptsTo(ProceedToPay.placeOrder(personalInformation));
  }

  @Then("^he should see the message (.*) as confirmation message$")
  public void heShouldSeeTheConfirmationMessage(String confirmationMessage) {
    theActorInTheSpotlight()
        .should(seeThat(ConfirmMessage.expectedMessage(), equalTo(confirmationMessage)));
  }
}
