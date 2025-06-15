package com.co.movil_exito.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.movil_exito.userinterface.checkoutPage.checkoutPage.ALERTA_NUMERO_NO_EXITO;

public class AlertaNumNoExito implements Question <String> {
    @Override
    public String answeredBy(Actor actor) {
        return ALERTA_NUMERO_NO_EXITO.resolveFor(actor).getText();
    }

    public static Question<String> es(){
        return new AlertaNumNoExito();
    }
}
