package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginSwagBloqueadoSteps;
import com.nttdata.steps.LoginSwagSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginSwagBloqueadoStepdefs {

    @Steps
    LoginSwagBloqueadoSteps loginSwagBloqueadoSteps;

    @Given("El usuario inicia el app login.")
    public void elUsuarioIniciaElAppLogin() {loginSwagBloqueadoSteps.userBloqueadologin();
    }

    @When("El usuario inicia sesión con sus credenciales usuario  Bloqueado")
    public void elUsuarioIniciaSesiónConSusCredencialesUsuarioBloqueado() {

    }

    @Then("valido que debería aparecer el msn de {string}")
    public void validoQueDeberíaAparecerElMsnDe(String text) {
        Assert.assertEquals(loginSwagBloqueadoSteps.getResultTextBloqueado(), text);
    }
}
