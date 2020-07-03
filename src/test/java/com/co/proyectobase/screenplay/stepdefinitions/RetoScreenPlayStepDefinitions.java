package com.co.proyectobase.screenplay.stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import models.Booking;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.AbreNavegador;
import tasks.BuscarHotel;
import tasks.FiltrarPopular;
import tasks.SeleccionarHotel;

import java.util.List;

public class RetoScreenPlayStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver herBrowser;

    private Actor laura = Actor.named("Laura");

    @Before
    public void setUp() {
        laura.can(BrowseTheWeb.with(herBrowser));
    }

    @Dado("^el cliente abre la pagina de booking$")
    public void elClienteAbreLaPaginaDeBooking() {
        laura.wasAbleTo(AbreNavegador.IrANavegar());

    }

      @Cuando("^el cliente selecciona la ciudad destino y las fechas del viaje$")
    public void elClienteSeleccionaLaCiudadDestinoYLasFechasDelViaje(List<Booking> hoteles) {
        laura.attemptsTo(BuscarHotel.irABuscar(hoteles));
    }

    @Cuando("^el cliente desea realizar una busqueda por filtros populares$")
    public void elClienteDeseaRealizarUnaBusquedaPorFiltrosPopulares() {
        laura.attemptsTo(FiltrarPopular.iraFiltrar());
    }


    @Cuando("^el cliente selecciona el hotel de su preferencia$")
    public void elClienteSeleccionaElHotelDeSuPreferencia() {
        laura.attemptsTo(SeleccionarHotel.iraMiHotel());
    }


    @Entonces("^se debe mostrar la informacion para realizar reserva$")
    public void seDebeMostrarLaInformacionParaRealizarReserva() {
        // Write code here that turns the phrase above into concrete actions

    }


}


