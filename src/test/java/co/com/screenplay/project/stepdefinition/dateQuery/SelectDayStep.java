package co.com.screenplay.project.stepdefinition.dateQuery;

import co.com.screenplay.project.questions.ValidateDatesQuestions;
import co.com.screenplay.project.tasks.dateQuery.IframeChange;
import co.com.screenplay.project.tasks.dateQuery.SelectDay;
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

public class SelectDayStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("cambie al iframe del calendario")
    public void iframeCalendar() {
        theActorInTheSpotlight().attemptsTo(
                new IframeChange(),
                Click.on(QueryUI.DATA_PICKER)
        );

    }

    @Then("seleccione el día {int} del mes actual")
    public void selectDay(Integer day) {
        theActorInTheSpotlight().attemptsTo(
                SelectDay.on(day)
        );
    }

    @And("^valide que la fecha es correcta \"([^\"]*)\"$")
    public void validateSelectDate(String fechaEsperada) {
        OnStage.theActorInTheSpotlight()
                .should(seeThat("expect date", ValidateDatesQuestions.valueResult(), equalTo(fechaEsperada))
        );

    }
}
