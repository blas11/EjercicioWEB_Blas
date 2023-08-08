package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.pageObject.OpenCart_MainPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class Cart implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                WaitUntil.the(OpenCart_MainPage.CART, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(OpenCart_MainPage.CART),
                WaitUntil.the(OpenCart_MainPage.VIEWCART, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(OpenCart_MainPage.VIEWCART),
                WaitUntil.the(OpenCart_MainPage.CHECKOUT, isClickable()).forNoMoreThan(20).seconds()
        );
    }
}
