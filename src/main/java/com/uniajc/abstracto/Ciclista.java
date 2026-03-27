package com.uniajc.abstracto;

public abstract class Ciclista {

    private int identificador;
    private String nombre;
    private int tiempoAcumulado;

    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado = 0;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(int tiempo) {
        this.tiempoAcumulado = tiempo;
    }

    public abstract String imprimirTipo();

    public void mostrarDatos() {
        System.out.println("Tipo: " + imprimirTipo());
    }
}