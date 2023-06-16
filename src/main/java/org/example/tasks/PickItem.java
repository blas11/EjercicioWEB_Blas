package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.pageObject.OpenCart_MainPage;
import org.openqa.selenium.*;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class PickItem implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        int i = 0;
        int cantidad = Integer.parseInt(t.recall("cantidad"));
        List<WebElement> listaElementos = getDriver().findElements(By.cssSelector("#content > div:nth-child(3) > div > div > div:nth-child(2) > div.button-group > button:nth-child(1)"));
        for (WebElement element : listaElementos) {
            element.click();
            i++;
            if (i == cantidad) break;
        }

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

