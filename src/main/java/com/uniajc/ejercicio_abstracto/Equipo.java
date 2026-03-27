package com.uniajc.ejercicio_abstracto;

public class Equipo {

    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo = 0;
    private java.util.List<Ciclista> ciclistas;

    public Equipo(String nombreEquipo, String pais, int tiempoTotalEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.tiempoTotalEquipo = tiempoTotalEquipo;
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

    protected static int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    protected static void setTiempoTotalEquipo(int tiempoTotalEquipo) {
        Equipo.tiempoTotalEquipo = tiempoTotalEquipo;
    }

    public void añadirCiclista(Ciclista ciclista) {
        if (ciclistas == null) {
            ciclistas = new java.util.ArrayList<>();
        }
        ciclistas.add(ciclista);
    }

    public void imprimirDatosEquipo() {
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("País: " + pais);
        System.out.println("Tiempo total del equipo: " + tiempoTotalEquipo + " minutos");
    }

    public void listarNombresCiclistas() {
        if (ciclistas != null) {
            System.out.println("Ciclistas del equipo:");
            for (Ciclista ciclista : ciclistas) {
                System.out.println("- " + ciclista.getNombre());
            }
        } else {
            System.out.println("No hay ciclistas en el equipo.");
        }

    }

    public void imprimirDatosCiclistaPorId(int identificador) {
        for (Ciclista ciclista : ciclistas) {
            if (ciclista.getIdentificador() == identificador) {
                ciclista.ImprimirDatos();
                return;
            }
        }
        System.out.println("Ciclista con identificador " + identificador + " no encontrado.");
    }

    public void calcularTiempoTotalEquipo() {
        int tiempoTotalEquipo = 0;
        if (ciclistas != null) {
            for (Ciclista ciclista : ciclistas) {
                tiempoTotalEquipo += ciclista.getTiempoAcumulado();
            }
        }
        setTiempoTotalEquipo(tiempoTotalEquipo);
    }

}
