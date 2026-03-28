package com.uniajc.ejercicio_abstracto;

public abstract class Ciclista {

    protected int identificador;
    protected String nombre;
    protected int tiempoAcumulado;

    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado = 0;
    }

    public abstract String imprimirTipo();

    public void imprimirDatos() {
        System.out.println("Tipo: " + imprimirTipo());
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo acumulado: " + tiempoAcumulado);
    }

    public int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    public String getNombre() {
        return nombre;
    }
}