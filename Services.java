package com.mycompany.proyectointegrador;

import java.util.ArrayList;

public class Services {

    public static ArrayList<Hotel> crearHoteles() {
        ArrayList hotelesDisponibles = new ArrayList<Hotel>();

        hotelesDisponibles.add(new Hotel(1, 34, 200.43F, "Alborada", "direccionHotel", "telefonoHotel", "emailHotel"));
        hotelesDisponibles.add(new Hotel(2, 50, 200.43F, "Ritz Carlton", "direccionHotel", "telefonoHotel", "emailHotel"));
        hotelesDisponibles.add(new Hotel(3, 22, 200.43F, "Hyatt", "direccionHotel", "telefonoHotel", "emailHotel"));
        hotelesDisponibles.add(new Hotel(4, 3, 200.43F, "Luna Azul", "direccionHotel", "telefonoHotel", "emailHotel"));
        hotelesDisponibles.add(new Hotel(5, 1, 200.43F, "Blue Skies", "direccionHotel", "telefonoHotel", "emailHotel"));
        hotelesDisponibles.add(new Hotel(6, 10, 200.43F, "Maranatta", "direccionHotel", "telefonoHotel", "emailHotel"));
        hotelesDisponibles.add(new Hotel(7, 21, 200.43F, "Random Access", "direccionHotel", "telefonoHotel", "emailHotel"));
        hotelesDisponibles.add(new Hotel(8, 14, 200.43F, "Motelazo", "direccionHotel", "telefonoHotel", "emailHotel"));
        hotelesDisponibles.add(new Hotel(9, 8, 200.43F, "Lyon Hotel", "direccionHotel", "telefonoHotel", "emailHotel"));
        hotelesDisponibles.add(new Hotel(10, 11, 200.43F, "Trump Tower", "direccionHotel", "telefonoHotel", "emailHotel"));

        return hotelesDisponibles;
    }

    public static String mostrarNombreHoteles() {
        String nombresHoteles = "";
        ArrayList<Hotel> hoteles = crearHoteles();

        for (int i = 0; i < hoteles.size(); i++) {
            nombresHoteles += (i + 1) + " " + hoteles.get(i).getNombreHotel() + ". -- " + hoteles.get(i).getCapacidadMax() + " habitaciones." + "\n";
        }

        return nombresHoteles;
    }
}
