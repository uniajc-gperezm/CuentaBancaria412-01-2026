package com.uniajc.ejercicio_abstracto;

public class CarreraCiclistas {
    public static void main(String[] args) {

        equipo equipo1 = new equipo("Equipo A", "Colombia");
        equipo equipo2 = new equipo("Equipo B", "España");

        ciclista ciclista1 = new escalador(1, "Ciclista 1", 120, 3.5f, 8.0f);
        ciclista ciclista2 = new velocista(2, "Ciclista 2", 110, 400.0, 60.0);
        ciclista ciclista3 = new escalador(3, "Ciclista 3", 130, 3.0f, 10.0f);
        ciclista ciclista4 = new velocista(4, "Ciclista 4", 115, 450.0, 65.0);

        equipo1.agregarCiclista(ciclista1);
        equipo1.agregarCiclista(ciclista2);
        equipo2.agregarCiclista(ciclista3);
        equipo2.agregarCiclista(ciclista4);

        System.out.println("Información del Equipo 1:");
        equipo1.imprimirEquipo();

        System.out.println("\nInformación del Equipo 2:");
        equipo2.imprimirEquipo();
       
    }
}
