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

    public void agregar(Ciclista c) {
        lista.add(c);
    }

    public void listar() {
        System.out.println("Equipo: " + nombre + " (" + pais + ")");
        for (Ciclista c : lista) {
            System.out.println("- " + c.getNombre());
        }
    }

    public void buscar(int id) {
        for (Ciclista c : lista) {
            if (c.getId() == id) {
                c.mostrar();
                return;
            }
        }
        System.out.println("No existe ese ID.");
    }
}
