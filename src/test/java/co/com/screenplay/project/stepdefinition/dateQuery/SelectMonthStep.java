package co.com.screenplay.project.stepdefinition.dateQuery;

import co.com.screenplay.project.tasks.dateQuery.NextMont;
import co.com.screenplay.project.tasks.dateQuery.SelectDay;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

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
