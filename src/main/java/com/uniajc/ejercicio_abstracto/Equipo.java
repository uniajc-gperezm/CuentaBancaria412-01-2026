package com.uniajc.ejercicio_abstracto;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Ciclista> listaCiclistas;
    private int totalTiempo;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.listaCiclistas = new ArrayList<>();
        this.totalTiempo = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalTiempo() {
        return totalTiempo;
    }

    public void setTotalTiempo(int totalTiempo) {
        this.totalTiempo = totalTiempo;
    }

    public void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }

    public void calcularTotalTiempo() {
        totalTiempo = 0;
        for (Ciclista ciclista : listaCiclistas) {
            totalTiempo += ciclista.getTiempoAcumulado();
        }
    }

    public void imprimirEquipo() {
        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("Total tiempo del equipo: " + totalTiempo + " minutos");
        System.out.println("Ciclistas del equipo:");
        for (Ciclista ciclista : listaCiclistas) {
            System.out.println("-------------------");
            ciclista.imprimirDatos();
            System.out.println(ciclista.imprimirTipo());
        }
    }

    public Ciclista buscarCiclista(String nombre) {
        for (Ciclista ciclista : listaCiclistas) {
            if (ciclista.getNombre().equalsIgnoreCase(nombre)) {
                return ciclista;
            }
        }
        return null;
    }
}