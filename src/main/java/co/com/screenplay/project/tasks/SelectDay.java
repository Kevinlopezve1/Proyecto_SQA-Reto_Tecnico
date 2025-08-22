package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.QueryUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SelectDay implements Task {

    private final int day;

    public SelectDay(int day) {
        this.day = day;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(QueryUI.DAY_DATA_PICKER.of(String.valueOf(day)))
        );
    }

    public static Performable on(int day) {
        return instrumented(SelectDay.class, day);
    }
}


