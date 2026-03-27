package com.uniajc.abstracto;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre;
    private String pais;
    private List<Ciclista> ciclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    public void agregarCiclista(Ciclista c) {
        ciclistas.add(c);
    }

    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombre + " - " + pais);
    }

    public void listarCiclistas() {
        for (Ciclista c : ciclistas) {
            System.out.println(c.getNombre());
        }
    }

    public void buscarCiclista(int id) {
        for (Ciclista c : ciclistas) {
            if (c.getIdentificador() == id) {
                System.out.println("ID: " + c.getIdentificador());
                System.out.println("Nombre: " + c.getNombre());
                System.out.println("Tiempo: " + c.getTiempoAcumulado());
                c.mostrarDatos();
                return;
            }
        }
        System.out.println("Ciclista no encontrado");
    }

    public void calcularTiempoTotal() {
        int total = 0;
        for (Ciclista c : ciclistas) {
            total += c.getTiempoAcumulado();
        }
        System.out.println("Tiempo total del equipo: " + total);
    }
}