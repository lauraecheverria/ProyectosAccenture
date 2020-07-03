package com.co.proyectobase.screenplay.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/reto_screenplay.feature",
        tags="@RealizarReto",
        glue="com.co.proyectobase.screenplay.stepdefinitions",
        snippets=SnippetType.CAMELCASE		)

public class RetoScreenPlay {

}
