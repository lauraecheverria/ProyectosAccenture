package com.co.proyectobase.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.proyectobase.screenplay.userinterfaces.NavegadorPage.*;

public class Seleccionar implements Task {
    String methodName;

    public Seleccionar(String methodName) {
        this.methodName = methodName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (methodName.equals("elSeleccionaLaOpcionDeTarifario")){
            actor.attemptsTo(Click.on(CAMPO_TARIFARIO));
        }

        if(methodName.equals("elSeleccionaElDocumentoQueDeseaAbrir")) {
            actor.attemptsTo(Click.on(BTN_PDF));
        }

    }

    public static Seleccionar opcionBanistmo(String methodName){
        return Tasks.instrumented(Seleccionar.class,methodName);
    }
}

