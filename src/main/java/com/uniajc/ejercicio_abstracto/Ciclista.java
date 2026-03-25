package com.uniajc.ejercicio_abstracto;

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

    public void setTiempoAcumulado(int tiempoAcumulado) {

        this.tiempoAcumulado = tiempoAcumulado;
    }

    public void imprimirDatos() {

        System.out.println("Id: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo acumulado: " + tiempoAcumulado);
    }

    public abstract String imprimirTipo();

}