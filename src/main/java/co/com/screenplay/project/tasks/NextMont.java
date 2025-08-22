package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.QueryUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class NextMont implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(QueryUI.NEXT_MONTH)
        );
    }

}


