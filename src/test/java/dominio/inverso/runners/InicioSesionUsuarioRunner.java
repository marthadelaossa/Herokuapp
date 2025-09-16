package dominio.inverso.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "dominio.inverso.stepsDefinitions",
        tags = "@CASO1",
        snippets =  CucumberOptions.SnippetType.CAMELCASE)

public class InicioSesionUsuarioRunner {

}
