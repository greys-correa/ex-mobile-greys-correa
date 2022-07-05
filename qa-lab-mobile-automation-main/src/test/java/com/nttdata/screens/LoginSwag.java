package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;


public class LoginSwag extends PageObject {
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-standard_user\"]/android.widget.TextView")
    private WebElement txtcredenciales;


    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnLogin;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement lblEncontradoExito;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-locked_out_user\"]/android.widget.TextView")
    private WebElement userBloqueado;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
    private WebElement lbluserBloqueado;


    public void clickLoginExito(){
        txtcredenciales.click();
        btnLogin.click();

    }

    public void userBloqueadologin(){
        userBloqueado.click();
        btnLogin.click();

    }


    public String getResultTextExito(){
        return lblEncontradoExito.getText();
    }
    public String getResultTextBloqueado(){
        return lbluserBloqueado.getText();
    }
}
