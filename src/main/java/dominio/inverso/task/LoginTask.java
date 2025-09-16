package dominio.inverso.task;


import dominio.inverso.userInterface.LoginPageUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class LoginTask implements Task {

    String usuario;
    String clave;


    public LoginTask(String usuario, String clave) {
        this.clave = clave;
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    WaitUntil.the(LoginPageUI.BTN_LOGIN, isClickable()).forNoMoreThan(30).seconds()
            );
            actor.attemptsTo(
                   Enter.theValue(usuario).into(LoginPageUI.INPUT_USERNAME),
                   Enter.theValue(clave).into(LoginPageUI.INPUT_PASSWORD),
                   Click.on(LoginPageUI.BTN_LOGIN)
            );

        }
public static Performable ir (String usuario, String clave) {
        return Instrumented.instanceOf(LoginTask.class).withProperties(usuario,clave);
    }
}