package com.mycompany.proyectointegrador;

public class TripulacionDeVuelo extends Cliente {

    private String aerolinea = "?";

    public TripulacionDeVuelo(String aerolinea, int id, String nombreCliente, String apellidoCliente, String telefonoCliente, String emailCliente, String dniCliente, boolean isClienteFrecuente) {
        super(id, nombreCliente, apellidoCliente, telefonoCliente, emailCliente, dniCliente, isClienteFrecuente);
        this.aerolinea = aerolinea;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }
    
    

}
