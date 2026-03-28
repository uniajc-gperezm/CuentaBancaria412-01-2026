package com.uniajc.ejercicio_abstracto;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String pais;
    private static int sumaTiemposCarrera = 0;
    private ArrayList<Ciclista> ciclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getPais() {
        return pais;
    }

    protected void setPais(String pais) {
        this.pais = pais;
    }

    protected static int getSumaTiemposCarrera() {
        return sumaTiemposCarrera;
    }

    protected static void setSumaTiemposCarrera(int suma) {
        sumaTiemposCarrera = suma;
    }

    protected ArrayList<Ciclista> getCiclistas() {
        return ciclistas;
    }

    protected void setCiclistas(ArrayList<Ciclista> ciclistas) {
        this.ciclistas = ciclistas;
    }

    public void imprimir() {
        System.out.println("Equipo: " + nombre);
        System.out.println("País: " + pais);
        System.out.println("Ciclistas:");
        for (Ciclista c : ciclistas) {
            c.imprimir();
            System.out.println(c.imprimirTipo());
            System.out.println("---");
        }
        System.out.println("Suma tiempos carrera: " + calcularSumaTiemposCarrera() + " min");
    }

    public void anadirCiclista(Ciclista c) {
        ciclistas.add(c);
    }

    public int calcularSumaTiemposCarrera() {
        int suma = 0;
        for (Ciclista c : ciclistas) {
            suma += c.getTiempoAcumulado();
        }
        sumaTiemposCarrera = suma;
        return suma;
    }

    public void listarCiclistas() {
        for (Ciclista c : ciclistas) {
            System.out.println(c.getNombre());
        }
    }

    public void imprimirCiclistaPorId(int id) {
        for (Ciclista c : ciclistas) {
            if (c.getIdentificador() == id) {
                c.imprimir();
                System.out.println(c.imprimirTipo());
                return;
            }
        }
        System.out.println("No existe un ciclista con el identificador " + id);
    }
}
