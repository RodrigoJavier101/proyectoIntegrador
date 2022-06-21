package com.mycompany.proyectointegrador;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Hotel {

    private int idHotel, capacidadMax;
    private float valorEstadiaPorDia;
    private String nombreHotel, direccionHotel, telefonoHotel, emailHotel;
    private ArrayList<LocalDateTime> fechasDisponibilidad = new ArrayList<LocalDateTime>();

    public Hotel(int idHotel, int capacidadMax, float valorEstadiaPorDia, String nombreHotel, String direccionHotel, String telefonoHotel, String emailHotel) {
        this.idHotel = idHotel;
        this.capacidadMax = capacidadMax;
        this.valorEstadiaPorDia = valorEstadiaPorDia;
        this.nombreHotel = nombreHotel;
        this.direccionHotel = direccionHotel;
        this.telefonoHotel = telefonoHotel;
        this.emailHotel = emailHotel;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public float getValorEstadiaPorDia() {
        return valorEstadiaPorDia;
    }

    public void setValorEstadiaPorDia(float valorEstadiaPorDia) {
        this.valorEstadiaPorDia = valorEstadiaPorDia;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getDireccionHotel() {
        return direccionHotel;
    }

    public void setDireccionHotel(String direccionHotel) {
        this.direccionHotel = direccionHotel;
    }

    public String getTelefonoHotel() {
        return telefonoHotel;
    }

    public void setTelefonoHotel(String telefonoHotel) {
        this.telefonoHotel = telefonoHotel;
    }

    public String getEmailHotel() {
        return emailHotel;
    }

    public void setEmailHotel(String emailHotel) {
        this.emailHotel = emailHotel;
    }

    public ArrayList<LocalDateTime> getFechasDisponibilidad() {
        return fechasDisponibilidad;
    }

    public void setFechasDisponibilidad(ArrayList<LocalDateTime> fechasDisponibilidad) {
        this.fechasDisponibilidad = fechasDisponibilidad;
    }

}
