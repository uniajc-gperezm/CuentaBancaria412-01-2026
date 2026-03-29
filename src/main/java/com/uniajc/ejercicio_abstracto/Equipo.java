package com.uniajc.ejercicio_abstracto;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo;
    private List<Ciclista> ciclistas;

    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    public void setTiempoTotalEquipo(int tiempoTotalEquipo) {
        Equipo.tiempoTotalEquipo = tiempoTotalEquipo;
    }

    public void añadirCiclista(Ciclista c) {
        ciclistas.add(c);
    }

    public void imprimirDatosEquipo() {
        System.out.println("Equipo: " + nombreEquipo);
        System.out.println("País: " + pais);
        System.out.println("Tiempo total: " + tiempoTotalEquipo);
    }

    public void listarNombresCiclistas() {
        for (Ciclista c : ciclistas) {
            System.out.println(c.getNombre());
        }
    }

    public void imprimirDatosCiclistaPorId(int id) {
        for (Ciclista c : ciclistas) {
            if (c.getIdentificador() == id) {
                c.imprimirDatos();
                return;
            }
        }
        System.out.println("Ciclista no encontrado");
    }
}
