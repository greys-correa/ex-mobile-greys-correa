package com.nttdata.stepsdefinitions;

import com.nttdata.steps.AirbnbSearchSteps;
import com.nttdata.steps.LoginSwagSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginSwagStepdefs {

    @Steps
    LoginSwagSteps loginSwagSteps;

    @Given("El usuario abre el app login.")
    public void elUsuarioAbreElAppLogin() {loginSwagSteps.clickLogin();
    }

    @When("El usuario inicia sesión con sus credenciales")
    public void elUsuarioIniciaSesiónConSusCredenciales() {

    }

    @Then("valido que debería aparecer el título de {string}")
    public void validoQueDeberíaAparecerElTítuloDe(String text) {
        Assert.assertEquals(loginSwagSteps.getResultText(), text);
    }


}
