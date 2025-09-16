package dominio.inverso.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MainPageUI extends PageObject {
    public static final Target LBL_LOGGED = Target.the("Label Logged").locatedBy("//div[@id='flash-messages']");
    public static final Target BTN_Logout=Target.the("Button Logout").locatedBy("//a[@href='/logout']");
}
