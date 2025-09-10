package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.QueryUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private final String user;
    private final String password;

    public Login (String user, String password) {
        this.user = user;
        this.password = password;
    }

    public static Login withCredentials(String user, String password) {
        return instrumented(Login.class, user, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(QueryUI.USER_NAME),
                Enter.theValue(password).into(QueryUI.PASSWORD),
                Click.on(QueryUI.LOGIN_BUTTON)
        );
    }
}