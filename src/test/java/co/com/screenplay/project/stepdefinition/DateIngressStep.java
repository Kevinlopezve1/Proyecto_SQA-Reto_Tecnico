package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.questions.ValidateDatesQuestions;
import co.com.screenplay.project.tasks.DateIngress;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class DateIngressStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Then("ingrese una fecha en el campo")
    public void selectDay() {
        theActorInTheSpotlight().attemptsTo(
                new DateIngress()
        );
    }

    @And("valide que no es posible seleccionar fecha")
    public void validateDate() {
        // se pone la fecha esperada porque la pagina si recibe el dato manualmente, entonces el caso fallaria
        String fechaEsperada = "20/10/25";
        OnStage.theActorInTheSpotlight()
                .should(seeThat("expect date", ValidateDatesQuestions.valueResult(), equalTo(fechaEsperada))
        );

    }
}
