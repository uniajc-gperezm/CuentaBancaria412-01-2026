package com.uniajc.ejercicio_abstracto;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreEquipo;
    private String pais;
    private int tiempoTotalEquipo;
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
        actualizarTiempoTotalEquipo();
        return tiempoTotalEquipo;
    }

    public void setTiempoTotalEquipo(int tiempoTotalEquipo) {
        this.tiempoTotalEquipo = tiempoTotalEquipo;
    }

    public void anadirCiclista(Ciclista ciclista) {
        if (ciclista == null) {
            return;
        }
        ciclistas.add(ciclista);
        actualizarTiempoTotalEquipo();
    }

    public void imprimirDatosEquipo() {
        actualizarTiempoTotalEquipo();
        System.out.println("Equipo: " + nombreEquipo);
        System.out.println("Pais: " + pais);
        System.out.println("Tiempo total del equipo: " + tiempoTotalEquipo);
        System.out.println("Cantidad de ciclistas: " + ciclistas.size());
    }

    public void listarNombresCiclistas() {
        System.out.println("Ciclistas del equipo " + nombreEquipo + ":");
        for (Ciclista ciclista : ciclistas) {
            System.out.println("- " + ciclista.getNombre());
        }
    }

    public void imprimirDatosCiclistaPorId(int id) {
        for (Ciclista ciclista : ciclistas) {
            if (ciclista.getIdentificador() == id) {
                ciclista.imprimirDatos();
                return;
            }
        }
        System.out.println("No existe un ciclista con id: " + id);
    }

    public Ciclista buscarCiclistaPorId(int id) {
        for (Ciclista ciclista : ciclistas) {
            if (ciclista.getIdentificador() == id) {
                return ciclista;
            }
        }
        return null;
    }

    private void actualizarTiempoTotalEquipo() {
        int total = 0;
        for (Ciclista ciclista : ciclistas) {
            total += ciclista.getTiempoAcumulado();
        }
        tiempoTotalEquipo = total;
    }
}
