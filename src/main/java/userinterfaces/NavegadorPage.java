package userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.booking.com/")
public class NavegadorPage extends PageObject {

    public static final Target CAMPO_BUSQUEDA=Target.the("campo busqueda")
        .locatedBy("//input[@id='ss']");

}

