package org.example.stepsdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;
import org.example.question.MainPage;
import org.example.question.MensajeConfirmacion;
import org.example.tasks.*;
import org.example.utils.CucumberTable;
import org.example.utils.EnvConf;
import org.hamcrest.CoreMatchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class openCartStepDefinition {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Steps
    EnvConf envConf;

    @Dado("^que me logueo a abstracta$")
    public void queSoyUnUsuarioRegistradoEnDemoblaze()
    {
        Actor actor =theActorCalled("Tomas");
        envConf.setUpall(theActorInTheSpotlight());
        theActorInTheSpotlight().attemptsTo(new VisitWebPage());
        theActorInTheSpotlight().should(seeThat(MainPage.displayed(), CoreMatchers.equalTo("Your Store")));


    }


    @When("^agrego (.*) productos de la categoria (.*)$")
    public void agregoProductosDeLaCategoria(String cantidad, String categoria) {
        theActorInTheSpotlight().remember("cantidad",cantidad);
        theActorInTheSpotlight().remember("categoria",categoria);
        theActorInTheSpotlight().attemptsTo(new PickCategory());
        theActorInTheSpotlight().attemptsTo(new PickItem());
    }

    @Y("^visualizo el carrito$")
    public void visualizoElCarrito()
    {
        theActorInTheSpotlight().attemptsTo(new Cart());
    }
    @Y("completo el 'Checkout' como invitado: 'Guest Checkout'")
    public void completoElFormulario(DataTable dataTable)
    {
        CucumberTable.rememberTableValues(dataTable);
        theActorInTheSpotlight().attemptsTo(new Checkout());
    }
    @Y("finalizo la compra")
    public void completoElFormulario()
    {
        theActorInTheSpotlight().attemptsTo(new Finalizar());
    }

    @And("^visualizo la confirmación: (.*)$")
    public void visualizoLaConfirmaciónValidacion(String mensaje) {
        theActorInTheSpotlight().should(seeThat("El estado : ", MensajeConfirmacion.displayed(), equalTo(mensaje)));
    }
}
