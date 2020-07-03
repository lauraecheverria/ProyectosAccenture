package com.co.proyectobase.screenplay.stepdefinitions;


import cucumber.api.java.Before;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


import java.util.List;

public class RetoScreenPlayStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver herBrowser;

    private Actor laura = Actor.named("Laura");

    @Before
    public void setUp() {
        laura.can(BrowseTheWeb.with(herBrowser));
    }


}


