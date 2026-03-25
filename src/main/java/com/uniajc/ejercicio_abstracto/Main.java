package com.uniajc.ejercicio_abstracto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Equipo equipo = new Equipo("EF", "Estonia");

        Velocista velocista1 = new Velocista(1, "Charles", 300, 45);
        Escalador escalador1 = new Escalador(2, "Joseph", 2.5f, 30);
        Contrarrelojista contra1 = new Contrarrelojista(3, "Louis", 50);

        velocista1.setTiempoAcumulado(50);
        escalador1.setTiempoAcumulado(60);
        contra1.setTiempoAcumulado(55);

        equipo.anadirCiclista(velocista1);
        equipo.anadirCiclista(escalador1);
        equipo.anadirCiclista(contra1);

        equipo.listarCiclistas();

        equipo.calcularTiempoTotal();
        equipo.imprimirEquipo();

        System.out.println("Buscar ciclista:");
        equipo.buscarCiclista(2);
    }
}