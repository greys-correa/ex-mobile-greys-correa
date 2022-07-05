package com.nttdata.steps;

import com.nttdata.screens.LoginSwag;
import net.thucydides.core.annotations.Step;

public class LoginSwagBloqueadoSteps {

    LoginSwag loginSwag;

    @Step("Click en userBloqueadologin")
    public void userBloqueadologin(){
        loginSwag.userBloqueadologin();
    }


    @Step("Obtiene el texto del resultado")
    public String getResultTextBloqueado(){
        return loginSwag.getResultTextBloqueado();
    }


}
