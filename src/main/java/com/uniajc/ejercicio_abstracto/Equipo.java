package com.uniajc.ejercicio_abstracto;

import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo;
    private ArrayList<Ciclista> ciclistas;

    protected Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    protected String getNombreEquipo() {
        return nombreEquipo;
    }

    protected void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    protected String getPais() {
        return pais;
    }

    protected void setPais(String pais) {
        this.pais = pais;
    }

    protected static int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    protected void añadirCiclista(Ciclista c) {
        ciclistas.add(c);
    }

    protected void imprimirDatosEquipo() {
        System.out.println("Equipo: " + nombreEquipo);
        System.out.println("País: " + pais);
    }

    protected void listarCiclistas() {
        for (Ciclista c : ciclistas) {
            System.out.println(c.getNombre());
        }
    }

    protected void calcularTiempoTotal() {
        tiempoTotalEquipo = 0;
        for (Ciclista c : ciclistas) {
            tiempoTotalEquipo += c.getTiempoAcumulado();
        }
    }

    protected void buscarCiclista(int id) {
        boolean encontrado = false;

        for (Ciclista c : ciclistas) {
            if (c.getIdentificador() == id) {
                c.imprimirDatos();
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Ciclista no encontrado");
        }
    }
}
