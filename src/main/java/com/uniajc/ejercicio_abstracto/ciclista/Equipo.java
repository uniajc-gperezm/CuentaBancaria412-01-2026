package com.uniajc.ejercicio_abstracto.ciclista;

import java.util.ArrayList;

public class Equipo {

    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo;
    private ArrayList<Ciclista> ciclistas;

    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        ciclistas = new ArrayList<>();
    }

    public void añadirCiclista(Ciclista c) {
        ciclistas.add(c);
    }

    public void listarNombresCiclistas() {
        for (Ciclista c : ciclistas) {
            System.out.println(c.getNombre());
        }
    }

    public void calcularTiempoTotal() {
        tiempoTotalEquipo = 0;
        for (Ciclista c : ciclistas) {
            tiempoTotalEquipo += c.getTiempoAcumulado();
        }
    }

    public void imprimirDatosEquipo() {
        System.out.println("Equipo: " + nombreEquipo);
        System.out.println("País: " + pais);
        System.out.println("Tiempo total: " + tiempoTotalEquipo);
    }

    public void imprimirDatosCiclistaPorId(int id) {
        boolean encontrado = false;

        for (Ciclista c : ciclistas) {
            if (c.getIdentificador() == id) {
                c.imprimirDatos();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Ciclista no encontrado");
        }
    }
}