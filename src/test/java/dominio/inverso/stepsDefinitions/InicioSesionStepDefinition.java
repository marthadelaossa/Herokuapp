package dominio.inverso.stepsDefinitions;

import dominio.inverso.driver.Driver;
import dominio.inverso.task.LoginTask;
import dominio.inverso.task.LogoutTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
public class InicioSesionStepDefinition {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario se encuentra en la pagina (.*) (.*)$")
    public void queElUsuarioSeEncuentraEnLaPagina(String navegador, String url) {
        OnStage.theActorCalled("tester").can(BrowseTheWeb.with(Driver.getDriver(url, navegador)));
    }

    @Cuando("el usuario se registra como usuario (.*) (.*)$")
    public void elUsuarioSeRegistraComoUsuarioUsuarioClave(String usuario, String clave) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.ir(usuario,clave));
    }

    @Entonces("^el usuario valida el inicion de sesion")
    public void elUsuarioValidaElInicionDeSesion() {
        OnStage.theActorInTheSpotlight().attemptsTo(LogoutTask.ir());
    }
}
