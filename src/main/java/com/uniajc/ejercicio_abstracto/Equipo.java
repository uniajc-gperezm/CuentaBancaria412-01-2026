package com.uniajc.ejercicio_abstracto;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private String pais;
    private int tiempoTotal;
    private List<Ciclista> ciclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.tiempoTotal = 0;
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

    protected int getTiempoTotal() {
        return tiempoTotal;
    }

    protected void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    protected List<Ciclista> getCiclistas() {
        return ciclistas;
    }

    protected void setCiclistas(List<Ciclista> ciclistas) {
        this.ciclistas = ciclistas;
    }

    protected void imprimirDatos() {
        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("País: " + pais);
        System.out.println("Tiempo total: " + tiempoTotal + " minutos");
        System.out.println("Ciclistas:");
        for (Ciclista c : ciclistas) {
            c.imprimirDatos();
            System.out.println(c.imprimirTipo());
            System.out.println("---");
        }
    }

    protected void añadirCiclista(Ciclista c) {
        ciclistas.add(c);
    }

    protected void calcularTotalTiempos() {
        tiempoTotal = 0;
        for (Ciclista c : ciclistas) {
            tiempoTotal += c.getTiempoAcumulado();
        }
    }

    protected void listarNombres() {
        System.out.println("Nombres de los ciclistas:");
        for (Ciclista c : ciclistas) {
            System.out.println(c.getNombre());
        }
    }

    protected void buscarCiclistaPorId(int id) {
        for (Ciclista c : ciclistas) {
            if (c.getId() == id) {
                c.imprimirDatos();
                System.out.println(c.imprimirTipo());
                return;
            }
        }
        System.out.println("Ciclista con ID " + id + " no encontrado.");
    }
}