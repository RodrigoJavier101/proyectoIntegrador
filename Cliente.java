package com.mycompany.proyectointegrador;

import java.util.ArrayList;

public class Cliente {

    private int id;
    private String nombreCliente, apellidoCliente, telefonoCliente, emailCliente, dniCliente;
    private ArrayList<Reserva> listaReservas = new ArrayList<Reserva>();
    private boolean isClienteFrecuente;

    Cliente(int id, String nombreCliente, String apellidoCliente, String telefonoCliente, String emailCliente, String dniCliente, boolean isClienteFrecuente) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.telefonoCliente = telefonoCliente;
        this.emailCliente = emailCliente;
        this.dniCliente = dniCliente;
        this.isClienteFrecuente = isClienteFrecuente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public boolean isIsClienteFrecuente() {
        return isClienteFrecuente;
    }

    public void setIsClienteFrecuente(boolean isClienteFrecuente) {
        this.isClienteFrecuente = isClienteFrecuente;
    }
    
    
    

}
