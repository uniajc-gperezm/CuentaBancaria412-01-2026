package com.uniajc.ejercicio_abstracto;

import java.util.ArrayList;

public class Equipo {

    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo;

    private ArrayList<Ciclista> ciclistas;

    public Equipo(String nombre, String pais) {
        this.nombreEquipo = nombre;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    public void anadirCiclista(Ciclista c) {
        ciclistas.add(c);
    }

    public void calcularTiempoTotal() {
        tiempoTotalEquipo = 0;
        for (Ciclista c : ciclistas) {
            tiempoTotalEquipo += c.getTiempoAcumulado();
        }
    }

    public void listarCiclistas() {
        for (Ciclista c : ciclistas) {
            System.out.println(c.getNombre());
        }
    }

    public void buscarCiclista(int id) {
        for (Ciclista c : ciclistas) {
            if (c.getIdentificador() == id) {
                c.imprimirDatos();
                System.out.println(c.imprimirTipo());
                return;
            }
        }
        System.out.println("Ciclista no se encuentra");
    }

    public void imprimirEquipo() {
        System.out.println("Equipo: " + nombreEquipo);
        System.out.println("Pais: " + pais);
        System.out.println("Tiempo total: " + tiempoTotalEquipo);
    }
}