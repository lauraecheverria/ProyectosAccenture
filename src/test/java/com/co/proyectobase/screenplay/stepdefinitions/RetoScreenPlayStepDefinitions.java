package com.co.proyectobase.screenplay.stepdefinitions;



import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromBy;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import com.co.proyectobase.screenplay.tasks.AbreNavegador;
import com.co.proyectobase.screenplay.tasks.Seleccionar;
import com.co.proyectobase.screenplay.userinterfaces.NavegadorPage;

public class RetoScreenPlayStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver herBrowser;

    private Actor laura = Actor.named("Laura");

    @Before
    public void setUp() {
        laura.can(BrowseTheWeb.with(herBrowser));
    }

    @Dado("^el usuario desea abrir el navegador$")
    public void elUsuarioDeseaAbrirElNavegador() {
        laura.wasAbleTo(AbreNavegador.irANavegar(new NavegadorPage()));
    }

    @Cuando("^el selecciona la opcion de Tarifario$")
    public void elSeleccionaLaOpcionDeTarifario() throws Exception {
        String methodName = new String(Thread.currentThread().getStackTrace()[1].getMethodName());
        laura.attemptsTo(Seleccionar.opcionBanistmo(methodName));
    }

    @Cuando("^el selecciona el documento que desea abrir$")
    public void elSeleccionaElDocumentoQueDeseaAbrir()  {
        String methodName = new String(Thread.currentThread().getStackTrace()[1].getMethodName());
        laura.attemptsTo(Seleccionar.opcionBanistmo(methodName));
    }

    @Entonces("^se debe mostrar el PDF abierto$")
    public void seDebeMostrarElPDFAbierto() throws Exception {


    }
}


