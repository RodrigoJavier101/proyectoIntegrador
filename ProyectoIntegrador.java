package com.mycompany.proyectointegrador;

import javax.swing.JOptionPane;

/* RESERVA HOTEL S.A. */

 /*
● Debe imprimir por consola “Hoteles disponibles” y abajo deberá mostrar un listado
con todos los hoteles disponibles con su capacidad.
● Debe imprimir por consola “Reservas” y deberá mostrar abajo un listado de los
clientes con sus reservas.
● Utilizar el scanner para ingresar a un cliente a un hotel y repita el proceso para 7
clientes.
● Los clientes frecuentes deberán tener un 20% de descuento en su estadía.
● La tripulación de vuelo deberá tener su estadía sin cargo.
● Debe imprimir por consola “Clientes hospedados” y abajo se debe mostrar una lista
de todos los clientes hospedados y el monto abonado por su estadía.
● De querer realizar una reserva se debe comparar los días de la estadía uno a uno
con la disponibilidad por fecha del hotel, en caso de TODOS los días estar
disponibles se acredita la reserva, caso contrario se muestra un mensaje de no
disponible
● Una vez realizada una reserva se enseña el valor total de la estadía teniendo en
cuenta todos los factores anteriores
 */
public class ProyectoIntegrador {

    public static void main(String[] args) {
        String hotelSeleccionado = JOptionPane.showInputDialog(null, "He aqui los hoteles disponibles. Selecciona uno \n"
                + Services.mostrarNombreHoteles());
    }
}
