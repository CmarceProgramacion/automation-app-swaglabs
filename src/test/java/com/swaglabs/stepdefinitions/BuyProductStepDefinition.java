package com.swaglabs.stepdefinitions;


import com.swaglabs.models.PurchaseModels;
import com.swaglabs.models.UserModel;
import com.swaglabs.tasks.BuyProductTask;
import com.swaglabs.tasks.LoginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class BuyProductStepDefinition {

    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("Pepito");
    }

    @Given("that I access the app of the Swaglabs")
    public void thatIAccessTheAppOfTheSwaglabs(List<List<String>> userData) {
        // theActorInTheSpotlight().can(BrowseTheWeb.with(hisMobileDevice));
        theActorInTheSpotlight().attemptsTo(LoginTask.withTheData(new UserModel(userData.get(0))));
    }

    @When("I add product to cart")
    public void iAddProductToCart(List<List<String>> purchaseData) {
        theActorInTheSpotlight().attemptsTo(BuyProductTask.withTheData(new PurchaseModels(purchaseData.get(0))));

    }

    @Then("Check the purchase confirmation message")
    public void checkThePurchaseConfirmationMessage(List<List<String>> userData) {

    }

}
