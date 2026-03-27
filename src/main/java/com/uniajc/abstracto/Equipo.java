package com.uniajc.abstracto;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private String pais;
    private static int totalTiempo;
    private ArrayList<Ciclista> listaCiclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.listaCiclistas = new ArrayList<>();
    }

    public void agregarCiclista(Ciclista c) {
        listaCiclistas.add(c);
    }

    public void listarCiclistas() {
        for (Ciclista c : listaCiclistas) {
            System.out.println(c.getNombre());
        }
    }

    public void buscarCiclista(int id) {
        for (Ciclista c : listaCiclistas) {
            if (c.getIdentificador() == id) {
                c.mostrarDatos();
                System.out.println(c.imprimirTipo());
                return;
            }
        }
        System.out.println("No se encontro el ciclista");
    }

    public void calcularTiempoTotal() {
        totalTiempo = 0;
        for (Ciclista c : listaCiclistas) {
            totalTiempo += c.getTiempoAcumulado();
        }
        System.out.println("Tiempo total del equipo: " + totalTiempo);
    }

    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombre);
        System.out.println("Pais: " + pais);
    }
}