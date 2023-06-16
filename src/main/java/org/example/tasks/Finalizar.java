package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.pageObject.OpenCart_MainPage;
import org.example.pageObject.OrderForm;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class Finalizar implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                WaitUntil.the(OrderForm.CONTINUEORDER,isClickable()).forNoMoreThan(20).seconds(),
                Click.on(OrderForm.CONTINUEORDER),
                WaitUntil.the(OrderForm.SUCCESSVALIDACION,isClickable()).forNoMoreThan(20).seconds()

        );
    }
}
