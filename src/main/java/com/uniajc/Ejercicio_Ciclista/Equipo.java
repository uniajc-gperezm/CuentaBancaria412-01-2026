package com.uniajc.Ejercicio_Ciclista;

import java.util.*;

public class Equipo {
    private String nombre;
    private String pais;
    private List<Ciclista> lista = new ArrayList<>();

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    // Método para calcular la suma de tiempos de sus ciclistas
    public int calcularTiempoTotal() {
        int total = 0;
        for (Ciclista c : lista) {
            total += c.getTiempo();
        }
        return total;
    }

    public void agregar(Ciclista c) {
        lista.add(c);
    }

    public String getNombre() { return nombre; }

    public void listar() {
        System.out.println("Equipo: " + nombre + " (" + pais + ") | Tiempo Total: " + calcularTiempoTotal() + " min");
        for (Ciclista c : lista) {
            System.out.println("- " + c.getNombre() + " (" + c.getTiempo() + " min)");
        }
    }
}
