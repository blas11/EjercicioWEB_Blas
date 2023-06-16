package org.example.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.example.pageObject.OpenCart_MainPage;
import org.example.pageObject.OrderForm;

public class MensajeConfirmacion implements Question {

    public static Question<String> displayed() {
        return new MensajeConfirmacion();
    }
    @Override
    public Object answeredBy(Actor actor) {

        return Text.of(OrderForm.MENSAJEVALIDACION).answeredBy(actor);
    }
}
