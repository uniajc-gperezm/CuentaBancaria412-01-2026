package com.uniajc.ejercicio_abstracto;

import java.util.ArrayList;

public class Equipo {

    private String nombreEquipo;
    private ArrayList<Ciclista> ciclistas;
    private static String pais;
    private int tiempoTotalEquipo;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.ciclistas = new ArrayList<>();
    }

    public void añadirCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
        System.out.println("Ciclista " + ciclista.getNombre() + " añadido al equipo.");
    }

    public void calcularTiempoTotal() {
        tiempoTotalEquipo = 0;
        for (Ciclista c : ciclistas) {
            tiempoTotalEquipo += c.getTiempoAcumulado();
        }
    }

    public void imprimirDatosEquipo() {
        System.out.println("\n===== DATOS DEL EQUIPO =====");
        System.out.println("Nombre: " + nombreEquipo);
        System.out.println("País: " + pais);
        System.out.println("Total ciclistas: " + ciclistas.size());

        calcularTiempoTotal();

        System.out.println("Tiempo total: " + tiempoTotalEquipo + " min");
    }

    public void listarCiclistas() {
        System.out.println("\n===== CICLISTAS DEL EQUIPO =====");

        if (ciclistas.isEmpty()) {
            System.out.println("No hay ciclistas registrados.");
        } else {
            for (Ciclista c : ciclistas) {
                c.imprimirDatos();
                System.out.println("----------------------");
            }
        }
    }

    public static void setPais(String pais) {
        Equipo.pais = pais;
    }
}
