package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.QueryUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TotalBuy implements Task {

    private final String name;
    private final String fullName;
    private final String postalCode;


    public TotalBuy(String name,String fullName,String postalCode) {
        this.name = name;
        this.fullName = fullName;
        this.postalCode = postalCode;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(QueryUI.ADD_CAR_BUTTON),
                WaitUntil.the(QueryUI.PAY_CAR_BUTTON, isVisible()).forNoMoreThan(2).seconds(),
                Click.on(QueryUI.PAY_CAR_BUTTON),
                Click.on(QueryUI.CHECKOUT_BUTTON),
                WaitUntil.the(QueryUI.FIRST_NAME, isVisible()).forNoMoreThan(2).seconds(),
                Enter.theValue(name).into(QueryUI.FIRST_NAME),
                Enter.theValue(fullName).into(QueryUI.LAST_NAME),
                Enter.theValue(postalCode).into(QueryUI.POSTAL_CODE),
                Click.on(QueryUI.CONTINUE_BUTTON),
                Scroll.to(QueryUI.FINISH_BUTTON),
                WaitUntil.the(QueryUI.FINISH_BUTTON, isVisible()).forNoMoreThan(2).seconds(),
                Click.on(QueryUI.FINISH_BUTTON)
        );
    }

}


