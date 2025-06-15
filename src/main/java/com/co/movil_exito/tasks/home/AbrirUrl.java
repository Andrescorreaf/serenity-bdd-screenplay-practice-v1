package com.co.movil_exito.tasks.home;

import com.co.movil_exito.transversal.MoviExitoPageUrl;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirUrl implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println(">>>>>< Intentando abiri la pagina");
        actor.attemptsTo(Open.browserOn().the(MoviExitoPageUrl.class));
    }

    public static AbrirUrl irahome() {
        return instrumented(AbrirUrl.class);
    }
}
