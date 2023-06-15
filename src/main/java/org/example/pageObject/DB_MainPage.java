package org.example.pageObject;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class DB_MainPage extends PageObject {
    public static final Target Store =Target.the("Your Store").locatedBy("//*[@id=\"logo\"]/h1/a");
    public static final Target LOGINBTN = Target.the("Log in").located(By.id("login2"));
    public static final Target NAMEOFUSER = Target.the("Username").located(By.id("nameofuser"));

    public static final Target ADDTOCART = Target.the("Phones").located(By.xpath("//*[text()='Add to cart']"));
    public static final Target CART = Target.the("CART").locatedBy("//*[@id=\"cart\"]/button");
    public static final Target CHECKOUT = Target.the("CHECKOUT").locatedBy("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]");
    public static final Target CONTINUE = Target.the("CONTINUE").locatedBy("//*[@id=\"button-account\"]");
    public static final Target GUEST = Target.the("GUEST").locatedBy("//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[2]/label/input");
//   public static final Target CART = Target.the("Cart").located(By.xpath("//*[@id=\"cartur\"]"));
    public static final Target PLACE_ORDER = Target.the("PlaceOrder").locatedBy("//*[@id=\"page-wrapper\"]/div/div[2]/button");

    public static final Target CREATE_ACCOUNT_BUTTON_DNI = Target.the("Boton siguiente").locatedBy("//*[@id='wc']/main/ibk-modal/div/section/app-login/div/form/ibk-button/button");


    public static void clickGuest(){
        ((JavascriptExecutor) getDriver()).executeScript("document.querySelector(\"#collapse-checkout-option > div > div > div:nth-child(1) > div:nth-child(4) > label > input[type=radio]\").click()");
    }
}
