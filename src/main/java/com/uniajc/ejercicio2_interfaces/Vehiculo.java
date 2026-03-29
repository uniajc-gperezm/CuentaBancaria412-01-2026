package com.uniajc.ejercicio2_interfaces;

public abstract class Vehiculo 
{
    protected int velocidadActual;
    protected int velocidadMaxima;

    public Vehiculo(int velocidadActual, int velocidadMaxima)
    {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract void acelerar(int velocidad);
    public abstract void frenar(int velocidad);

    public void imprimir() 
    {
        System.out.println("Velocidad actual: " + velocidadActual);
        System.out.println("Velocidad máxima: " + velocidadMaxima);
    }
}