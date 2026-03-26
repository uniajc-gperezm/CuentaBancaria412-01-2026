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
        tiempoTotalEquipo = 0;
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

    public void añadirCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
    }

    public void imprimirDatosEquipo() {
        System.out.println("=== Equipo: " + nombreEquipo + " ===");
        System.out.println("País: " + pais);
        System.out.println("Tiempo Total del Equipo: " + tiempoTotalEquipo);
        System.out.println("Número de ciclistas: " + ciclistas.size());
    }

    public void listarNombresCiclistas() {
        System.out.println("Ciclistas del equipo " + nombreEquipo + ":");
        for (Ciclista c : ciclistas) {
            System.out.println("  - " + c.getNombre() + " (" + c.imprimirTipo() + ")");
        }
    }

    public void imprimirDatosCiclistaPorId(int id) {
        for (Ciclista c : ciclistas) {
            if (c.getIdentificador() == id) {
                c.imprimirDatos();
                return;
            }
        }
        System.out.println("No se encontró un ciclista con ID: " + id);
    }
}