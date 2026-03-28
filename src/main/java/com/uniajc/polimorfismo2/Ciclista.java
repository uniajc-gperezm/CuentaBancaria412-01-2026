package com.uniajc.polimorfismo2;

public class Ciclista {

    protected int identificador;
    protected String nombre;
    protected double tiempo;

    public Ciclista(int identificador, String nombre, double tiempo) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public double calcularTiempo() {
        return tiempo;
    }

    public void imprimir() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo: " + tiempo);
    }
}
