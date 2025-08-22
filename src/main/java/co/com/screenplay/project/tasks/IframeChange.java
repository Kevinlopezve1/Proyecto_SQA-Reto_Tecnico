package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.QueryUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;


public class IframeChange implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Switch.toFrame(QueryUI.IFRAME_CALENDAR.resolveFor(actor))
        );
    }


}
