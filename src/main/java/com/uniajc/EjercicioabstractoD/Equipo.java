package com.uniajc.EjercicioabstractoD;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private String pais;
    private static int tiempoTotal;
    private ArrayList<Ciclista> ciclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public static int getTiempoTotal() {
        return tiempoTotal;
    }

    public void añadirCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
    }

    public void calcularTiempoTotal() {
        tiempoTotal = 0;
        for (Ciclista c : ciclistas) {
            tiempoTotal += c.getTiempoAcumulado();
        }
    }

    public void imprimirEquipo() {
        System.out.println("Equipo: " + nombre);
        System.out.println("País: " + pais);
        System.out.println("Tiempo total: " + tiempoTotal);
    }

    public void listarCiclistas() {
        for (Ciclista c : ciclistas) {
            System.out.println("Nombre: " + c.getNombre());
        }
    }

    public void buscarCiclista(int id) {
        for (Ciclista c : ciclistas) {
            if (c.getIdentificador() == id) {
                System.out.println("Ciclista encontrado:");
                c.imprimir();
                return;
            }
        }
        System.out.println("No se encontró el ciclista");
    }
}