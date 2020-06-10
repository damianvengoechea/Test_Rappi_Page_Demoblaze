package co.com.shoppingdemoblaze.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/buy_laptop.feature",
    glue = "co.com.shoppingdemoblaze.stepdefinitions",
    snippets = SnippetType.CAMELCASE)
public class BuyLaptop {}
