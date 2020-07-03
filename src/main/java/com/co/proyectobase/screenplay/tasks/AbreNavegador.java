package com.co.proyectobase.screenplay.tasks;

import com.co.proyectobase.screenplay.userinterfaces.NavegadorPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbreNavegador implements Task {

    private NavegadorPage navegadorPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(navegadorPage));
    }

public static AbreNavegador irANavegar(PageObject page){
    return Tasks.instrumented(AbreNavegador.class);

}
}
