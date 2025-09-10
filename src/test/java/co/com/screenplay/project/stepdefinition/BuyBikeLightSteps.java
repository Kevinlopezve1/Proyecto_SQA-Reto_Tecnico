package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.questions.ValidateDatesQuestions;
import co.com.screenplay.project.tasks.Login;
import co.com.screenplay.project.tasks.SelectOptionBikeLight;
import co.com.screenplay.project.tasks.TotalBuy;
import co.com.screenplay.project.utils.CsvRider;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.nio.file.Paths;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class BuyBikeLightSteps {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("ingrese la cuenta registrada")
    public void loginConCsv() {
        String path = Paths.get("src/test/resources/testdata/usuarios.csv").toString();
        List<String[]> data = CsvRider.getData(path);

        for (String[] fila : data) {
            String user = fila[0];
            String pass = fila[1];
            OnStage.theActorInTheSpotlight().attemptsTo(
                    Login.withCredentials(user, pass)
            );
        }
    }

    @And("selecione la opcion Sauce Labs Bike Light")
    public void selectOption() {
        theActorInTheSpotlight().attemptsTo(
                new SelectOptionBikeLight()
        );
    }

    @Then("realice la compra de la opcion seleccionada")
    public void buySelectOption() {
        String name = "Kevin";
        String fullName = "Lopez";
        String postalCode = "1185225";
        theActorInTheSpotlight().attemptsTo(
                new TotalBuy(name, fullName, postalCode)

        );
    }

    @And("valide que la compra sea efectiva")
    public void validateTittle() {
        String tituloEsperado = "Thank you for your order!";
        OnStage.theActorInTheSpotlight()
                .should(seeThat("expect tittle", ValidateDatesQuestions.validateTittleBuy(), equalTo(tituloEsperado))
                );

    }
}
