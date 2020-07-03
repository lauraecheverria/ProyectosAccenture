package models;

public class Booking {
    String ciudad_destino;

public Booking (String ciudad_destino){
    this.ciudad_destino=ciudad_destino;
    }

    public String getCiudad_destino() {
        return ciudad_destino;
    }

    public void setCiudad_destino(String ciudad_destino) {
        this.ciudad_destino = ciudad_destino;
    }
}
