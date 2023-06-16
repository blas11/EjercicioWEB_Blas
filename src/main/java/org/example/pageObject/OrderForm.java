package org.example.pageObject;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OrderForm extends PageObject {
    public static final Target CONTINUECHECKOUT = Target.the("CONTINUE").locatedBy("//*[@id=\"button-account\"]");
    public static final Target CONTINUEDETAILS = Target.the("CONTINUE DETAILS").locatedBy("//*[@id=\"button-guest\"]");
    public static final Target CONTINUEMETHOD = Target.the("CONTINUEMETHOD").locatedBy("//*[@id=\"button-shipping-method\"]");
    public static final Target CONTINUEPAYMENT = Target.the("CONTINUEPAYMENT").locatedBy("//*[@id=\"button-payment-method\"]");
    public static final Target CHECKTERMS = Target.the("CHECKTERMS").locatedBy("//*[@id=\"collapse-payment-method\"]/div/div[3]/div/input[1]");
    public static final Target CONTINUEORDER = Target.the("CHECKTERMS").locatedBy("//*[@id=\"button-confirm\"]");
    public static final Target SUCCESSVALIDACION = Target.the("SUCCESSVALIDACION").locatedBy("//*[@id=\"common-success\"]/ul/li[4]/a");
    public static final Target MENSAJEVALIDACION = Target.the("validacion").locatedBy("#content > h1");


    public static final Target FIRSTNAME = Target.the("Firstname").locatedBy("//*[@id=\"input-payment-firstname\"]");
    public static final Target LASTNAME = Target.the("LASTNAME").locatedBy("//*[@id=\"input-payment-lastname\"]");
    public static final Target EMAIL = Target.the("EMAIL").locatedBy("//*[@id=\"input-payment-email\"]");
    public static final Target TELEFONO = Target.the("TELEFONO").locatedBy("//*[@id=\"input-payment-telephone\"]");
    public static final Target COMPANY = Target.the("COMPANY").locatedBy("//*[@id=\"input-payment-company\"]");
    public static final Target ADDRESS = Target.the("COMPANY").locatedBy("//*[@id=\"input-payment-address-1\"]");
    public static final Target CITY = Target.the("city").locatedBy("//*[@id=\"input-payment-city\"]");
    public static final Target POSTCODE = Target.the("postcode").locatedBy("//*[@id=\"input-payment-postcode\"]");

    public static final Target COUNTRY = Target.the("country").locatedBy("//*[@id=\"input-payment-country\"]");
    public static final Target REGION = Target.the("region").locatedBy("//*[@id=\"input-payment-zone\"]");

    public static final Target CARD = Target.the("card").located(By.id("card"));
    public static final Target MONTH = Target.the("month").located(By.id("month"));
    public static final Target YEAR = Target.the("year").located(By.id("year"));
    public static final Target PURCHASE = Target.the("year").located(By.xpath("//*[text()='Purchase']"));
    public static final Target BTN_OK = Target.the("okBtn").located(By.xpath("/html/body/div[10]/div[7]/div/button"));


}
