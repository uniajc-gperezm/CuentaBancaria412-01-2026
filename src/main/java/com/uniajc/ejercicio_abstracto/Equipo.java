package com.uniajc.ejercicio_abstracto;

import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private String pais;
    private static int tiempoTotal = 0;
    private ArrayList<Ciclista> ciclistas;

    public Equipo(String nombre, String pais) {  
        this.nombreEquipo = nombre;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    public void añadirCiclista(Ciclista c) {
        ciclistas.add(c);
    }

    public void calcularTiempoTotal() {
        tiempoTotal = 0;
        for (Ciclista c : ciclistas) {
            tiempoTotal += c.getTiempoAcumulado();
        }
    }

    public void listarCiclistas() {
    System.out.println("Lista de ciclistas:");
    for (Ciclista c : ciclistas) {
        System.out.println(c.getNombre());
        
    }
   } 

    public void imprimirDatosEquipo() {
        System.out.println("Equipo: " + nombreEquipo);
        System.out.println("País: " + pais);
        System.out.println("Tiempo total: " + tiempoTotal);

        System.out.println("Datos del equipo mostrados correctamente");
    }

    public void buscarCiclista(int id) {
        for (Ciclista c : ciclistas) {
            if (c.getIdentificador() == id) {
                c.imprimirDatos();
                return;
            }
        }
        System.out.println("Ciclista no Encontrado");
    }
}