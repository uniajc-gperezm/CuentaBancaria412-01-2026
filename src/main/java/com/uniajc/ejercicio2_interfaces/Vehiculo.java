package com.uniajc.ejercicio2_interfaces;

public abstract class Vehiculo {
    protected int velocidadActual;
    protected int velocidadMaxima;

    public Vehiculo(int velocidadActual, int velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void imprimir() {
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
        System.out.println("Velocidad Maxima: " + velocidadMaxima + " km/h");
    }

    public abstract void acelerar(int velocidad);
    public abstract void frenar(int velocidad);
}