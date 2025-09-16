package dominio.inverso.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPageUI extends PageObject{

    public static final Target INPUT_USERNAME = Target.the("Input User Name").locatedBy("//input[@id='username']");
    public static final Target INPUT_PASSWORD = Target.the("Input Password").locatedBy("//input[@id='password']");
    public static final Target BTN_LOGIN = Target.the("Button Login").locatedBy("//i[text()=' Login']");

}
