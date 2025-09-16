package dominio.inverso.task;


import dominio.inverso.userInterface.LoginPageUI;
import dominio.inverso.userInterface.MainPageUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;


public class LogoutTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        Ensure.that(MainPageUI.LBL_LOGGED).isDisplayed();
        Ensure.that(MainPageUI.BTN_Logout).isDisplayed();
        actor.attemptsTo(Click.on(MainPageUI.BTN_Logout));
        Ensure.that(LoginPageUI.BTN_LOGIN).isDisplayed();
        }
public static Performable ir ( ) {
        return Instrumented.instanceOf(LogoutTask.class).withProperties();
    }
}