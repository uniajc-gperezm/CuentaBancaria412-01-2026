package com.uniajc.ejercicio_abstracto;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    
    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo = 0;
    private List<Ciclista> ciclistas;

    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    protected String getNombreEquipo() {
        return nombreEquipo;
    }

    protected void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    protected String getPais() {
        return pais;
    }

    protected void setPais(String pais) {
        this.pais = pais;
    }

    protected int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }
    
    protected void setTiempoTotalEquipo(int tiempoTotalEquipo) { 
        Equipo.tiempoTotalEquipo = tiempoTotalEquipo; 
    }

    // Métodos para gestionar ciclistas en el equipo
    public void añadirCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
        System.out.println("Ciclista " +ciclista.getNombre()+ " añadido al equipo.");
    }

    public void imprimirDatosEquipo() {
        System.out.println("\n===== Datos del Equipo =====");
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("País: " + pais);
        System.out.println("Total ciclistas: " + ciclistas.size());
        calcularTiempoTotal();
        System.out.println("Tiempo total del equipo: " + tiempoTotalEquipo + " min");
    }

    public void calcularTiempoTotal() {
        tiempoTotalEquipo = 0;
        for(Ciclista c : ciclistas) {
            tiempoTotalEquipo += c.getTiempoAcumulado();
        }
    }

    public void listarNombresCiclistas() {
        System.out.println("\n===== Ciclistas del equipo " + nombreEquipo + " =====");
        if(ciclistas.isEmpty()) {
            System.out.println("No hay ciclistas registrados.");
        } else {
            for(int i = 0; i < ciclistas.size(); i++) {
                System.out.println((i+1)+ ". " +ciclistas.get(i).getNombre());
            }
        }
    }

    public void imprimirDatosCiclistaPorId(int id) {
        boolean encontrado = false;

        for(Ciclista c : ciclistas) {
            if(c.getIdentificador() == id) {
                System.out.println("\n===== Datos del Ciclista =====");
                c.imprimirDatos();
                encontrado = true;
                break;
            }
        }

        if(!encontrado) {
            System.out.println("No existe un ciclista con el identificador " +id);
        }
    }
}