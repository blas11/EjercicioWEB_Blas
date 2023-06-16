package org.example.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.pageObject.OpenCart_MainPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MainPage implements Question {

    public static Question<String> displayed() {
        return new MainPage();
    }
    @Override
    public Object answeredBy(Actor actor) {
        WaitUntil.the(OpenCart_MainPage.Store,isVisible()).forNoMoreThan(10).seconds();
        return Text.of(OpenCart_MainPage.Store).answeredBy(actor);
    }
}
