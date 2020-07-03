package com.co.proyectobase.screenplay.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class NavegadorPage extends PageObject {

    public static final Target CAMPO_TARIFARIO=Target.the("campo busqueda").locatedBy("//a[contains(text(),'Tarifario')]");
    public static final Target BTN_PDF=Target.the("selecciona documendo pdf").locatedBy("//*[@id='main-content']/div[1]/div/div/table/tbody/tr[2]/td[2]/span/a/img");


}

