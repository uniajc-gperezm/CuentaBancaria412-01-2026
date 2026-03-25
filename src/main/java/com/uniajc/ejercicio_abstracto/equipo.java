package com.uniajc.ejercicio_abstracto;

import java.util.ArrayList;
import java.util.List;



public class Equipo {
    
    private String nombreEquipo;
    private String Pais;
    private static int tiempoTotalEquipo;
    private List<Ciclista> ciclistas;

    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.Pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    public void setTiempoTotalEquipo(int tiempoTotalEquipo) {
        Equipo.tiempoTotalEquipo = tiempoTotalEquipo;
    }

    public void agregarCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
        tiempoTotalEquipo += ciclista.getTiempoAcomulado();
    }

    public void imprimirEquipo() {
        System.out.println("Nombre del Equipo: " + nombreEquipo);
        System.out.println("País: " + Pais);
        System.out.println("Tiempo Total del Equipo: " + tiempoTotalEquipo);
        System.out.println("Ciclistas:");
        for (Ciclista ciclista : ciclistas) {
            System.out.println("- " + ciclista.getNombre() + " (" + ciclista.imprimirTipo() + ")");
        }
    }


    public void listarNombreCiclistas() {
        System.out.println("Ciclistas del equipo " + nombreEquipo + ":");
        for (Ciclista c : ciclistas) {
            System.out.println("- " + c.getNombre());
        }
    }

    public void imprimirDatosCiclistasPorIden(int identificador) {
        System.out.println("Datos de los ciclistas del equipo " + nombreEquipo + ":");
        for (Ciclista c : ciclistas) {
            if (c.getIdentificador()== identificador) {
                c.imprimirDatos();
                return;
            }
        }
        System.out.println("Ciclista con identificador " + identificador + " no encontrado en el equipo " + nombreEquipo);

    }


    
}
