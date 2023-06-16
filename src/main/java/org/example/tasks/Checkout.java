package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.pageObject.OpenCart_MainPage;
import org.example.pageObject.OrderForm;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Checkout implements Task {
    @Override
    public <T extends Actor> void performAs(T t)
    {

        t.attemptsTo(
                Click.on(OpenCart_MainPage.CHECKOUT),
                WaitUntil.the(OpenCart_MainPage.GUEST,isClickable()).forNoMoreThan(20).seconds(),
                Click.on(OpenCart_MainPage.GUEST),
                Click.on(OrderForm.CONTINUECHECKOUT),
                WaitUntil.the(OrderForm.CONTINUEDETAILS,isClickable()).forNoMoreThan(20).seconds()
        );


        String FirstName= t.recall("FirstName");
        String LastName = t.recall("LastName");
        String Email = t.recall("Email");
        String Telefono = t.recall("Telefono");
        String Company = t.recall("Company");
        String Address = t.recall("Address");
        String City = t.recall("City");
        String PostCode = t.recall("PostCode");
        String Country = t.recall("Country");
        String Region = t.recall("Region");


        t.attemptsTo(
                Enter.theValue(FirstName).into(OrderForm.FIRSTNAME),
                Enter.theValue(LastName).into(OrderForm.LASTNAME),
                Enter.theValue(Email).into(OrderForm.EMAIL),
                Enter.theValue(Telefono).into(OrderForm.TELEFONO),
                Enter.theValue(Company).into(OrderForm.COMPANY),
                Enter.theValue(Address).into(OrderForm.ADDRESS),
                Enter.theValue(City).into(OrderForm.CITY),
                Enter.theValue(PostCode).into(OrderForm.POSTCODE),
                SelectFromOptions.byVisibleText(Country).from(OrderForm.COUNTRY),
                SelectFromOptions.byVisibleText(Region).from(OrderForm.REGION)
        );

        t.attemptsTo(
                WaitUntil.the(OrderForm.CONTINUEDETAILS,isClickable()).forNoMoreThan(20).seconds(),
                Scroll.to(OrderForm.CONTINUEDETAILS),
                Click.on(OrderForm.CONTINUEDETAILS),
                WaitUntil.the(OrderForm.CONTINUEMETHOD,isClickable()).forNoMoreThan(20).seconds(),
                Click.on(OrderForm.CONTINUEMETHOD),
                WaitUntil.the(OrderForm.CONTINUEPAYMENT,isClickable()).forNoMoreThan(20).seconds(),
                Click.on(OrderForm.CHECKTERMS),
                Click.on(OrderForm.CONTINUEPAYMENT)
        );

        System.out.println("");





    }
}
