package com.mycompany.proyectointegrador;

import java.time.LocalDateTime;

public class Reserva {

    private int idReserva;
    private Cliente cliente;
    private Hotel hotel;
    private LocalDateTime fechaEstadiaDesde;
    private LocalDateTime fechaEstadíaHasta;

    public Reserva(int idReserva, Cliente cliente, Hotel hotel, LocalDateTime fechaEstadiaDesde, LocalDateTime fechaEstadíaHasta) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.hotel = hotel;
        this.fechaEstadiaDesde = fechaEstadiaDesde;
        this.fechaEstadíaHasta = fechaEstadíaHasta;
    }

    public LocalDateTime getFechaEstadíaHasta() {
        return fechaEstadíaHasta;
    }

    public void setFechaEstadíaHasta(LocalDateTime fechaEstadíaHasta) {
        this.fechaEstadíaHasta = fechaEstadíaHasta;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public LocalDateTime getFechaEstadiaDesde() {
        return fechaEstadiaDesde;
    }

    public void setFechaEstadiaDesde(LocalDateTime fechaEstadiaDesde) {
        this.fechaEstadiaDesde = fechaEstadiaDesde;
    }
    
    
}
