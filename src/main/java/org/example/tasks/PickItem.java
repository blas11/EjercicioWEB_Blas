package org.example.tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.pageObject.DB_MainPage;
import org.example.pageObject.LoginForm;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class PickItem implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        int i = 0;

        List<WebElement> listaElementos = getDriver().findElements(By.cssSelector("#root > div > div > main > div > div > ibk-business-accounts > ba-container > ibk-modal > main > ba-legal-person-container > ba-legal-person-data-step > ba-address-form > div:nth-child(2) > ibk-input-group:nth-child(1) > ibk-select > ibk-select-option"));

        for (WebElement element : listaElementos) {
            element.click();
            i++;
            if (i == Integer.parseInt(t.recall("cantidad"))) break;
        }

        t.attemptsTo(
                Click.on(DB_MainPage.CART),
                Click.on(DB_MainPage.CHECKOUT),
                WaitUntil.the(DB_MainPage.CONTINUE,isClickable()).forNoMoreThan(20).seconds()
        );




    }
}



//        int cantidad = t.recall("cantidad");
//        WebDriver driver = Serenity.getDriver();
//        int cantItems = driver.findElements(By.xpath("//div[@class='card h-100']")).size();
//
//        Random random = new Random();
//
//        for(int i=0; i<cantidad;i ++) {
//            int randomNumber = random.nextInt(cantItems) + 1;
//            Target randomItem = Target.the("randomItem").located(By.xpath("//*[@id=\"tbodyid\"]/div["+randomNumber+"]"));
//
//
//            t.attemptsTo(Click.on(randomItem),
//                    WaitFor.seconds(3),
//                    WaitUntil.the(DB_MainPage.ADDTOCART,isVisible()).forNoMoreThan(20).seconds(),
//                    Click.on(DB_MainPage.ADDTOCART)
//                    ,WaitFor.seconds(3)
//            );
//
//            Alert alert = driver.switchTo().alert();
//            alert.accept();
//
//            t.attemptsTo(
//            WaitUntil.the(DB_MainPage.HOME,isVisible()).forNoMoreThan(20).seconds(),
//                    Click.on(DB_MainPage.HOME),
//                    WaitUntil.the(DB_MainPage.CATEGORIES,isVisible()).forNoMoreThan(20).seconds()
//            );
//
//        }

