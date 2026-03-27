package com.uniajc.ejercicio2_interfaces;

public abstract class Vehiculo {

    protected int velocidadActual;
    protected int velocidadMaxima;

    public Vehiculo(int velocidadActual, int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
    }

    public abstract void acelerar(int velocidad);

    public abstract void frenar(int velocidad);

    public abstract void imprimir(); 

}
