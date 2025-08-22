package co.com.screenplay.project.hook;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.screenplay.project.utils.Constants.WEB_URL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenWeb implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Obtiene la URL desde serenity.conf o serenity.properties
        String pathWebUrl = Serenity.environmentVariables().getProperty(WEB_URL);
        actor.attemptsTo(Open.url(pathWebUrl));
    }

    public static Performable browserURL() {
        return instrumented(OpenWeb.class);
    }
}