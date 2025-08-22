package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.questions.ValidateDatesQuestions;
import co.com.screenplay.project.tasks.IframeChange;
import co.com.screenplay.project.tasks.NextMont;
import co.com.screenplay.project.tasks.SelectDay;
import co.com.screenplay.project.ui.QueryUI;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class SelectMonthStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Then("seleccione el día {int} del mes siguiente")
    public void selectDay(Integer day) {
        theActorInTheSpotlight().attemptsTo(
                new NextMont(),
                SelectDay.on(day)
        );
    }
}
