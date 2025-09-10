package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.tasks.SelectOptionFleeceJacket;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyFleeceJacketSteps {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Then("selecione la opcion Sauce Labs Fleece Jacket")
    public void selectDay() {
        theActorInTheSpotlight().attemptsTo(
                new SelectOptionFleeceJacket()
        );
    }

}
