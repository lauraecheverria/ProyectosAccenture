package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.NavegadorPage;

public class AbreNavegador implements Task {

    private NavegadorPage navegadorPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(navegadorPage));
    }

public static AbreNavegador IrANavegar(){
    return Tasks.instrumented(AbreNavegador.class);

}
}
