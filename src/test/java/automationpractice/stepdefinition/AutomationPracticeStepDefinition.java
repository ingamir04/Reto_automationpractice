package automationpractice.stepdefinition;

import automationpractice.model.Data;
import automationpractice.questions.Respuesta;
import automationpractice.tasks.Abrir;
import automationpractice.tasks.Compra;
import automationpractice.tasks.Registro;
import automationpractice.tasks.Seleccionar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class AutomationPracticeStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Register on the page$")
    public void register_on_the_page(List<Data> data) throws Exception {
        OnStage.theActorCalled("Amir").wasAbleTo(Abrir.pagina(), (Seleccionar.prendas()), (Registro.pagina(data.get(0).getStremail(), data.get(0).getSrtname(),data.get(0).getSrtlast(),data.get(0).getStrcontrasena(),data.get(0).getStrcompania(),data.get(0).getStrdireccion(),data.get(0).getStrdireccion2(),data.get(0).getStrcity(),data.get(0).getStrpostal(),data.get(0).getStrtelefono())));
    }

    @When("^To make a purchase$")
    public void to_make_a_purchase() {
        OnStage.theActorInTheSpotlight().attemptsTo(Compra.pagina());

    }

    @Then("^Confirm the completion of the purchase$")
    public void confirm_the_completion_of_the_purchase_Order_confirmation(List<Data> data) throws Exception  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Respuesta.pagina(data.get(0).getStrconfirmacion())));
    }
}
