package com.nttdata.steps;

import com.nttdata.screens.LoginSwag;
import net.thucydides.core.annotations.Step;

public class LoginSwagSteps {

    LoginSwag loginSwag;

    @Step("Click en login")
    public void clickLogin(){
        loginSwag.clickLoginExito();
    }


    @Step("Obtiene el texto del resultado")
    public String getResultText(){
        return loginSwag.getResultTextExito();
    }


}
