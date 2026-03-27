package com.uniajc.ejercicio2_interface;

public abstract class Vehiculo {

    protected int velocidadActual;
    protected int velocidadMaxima;

    public Vehiculo(int velocidadMaxima) {
        this.velocidadActual = 0;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(int incremento) {
        velocidadActual += incremento;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
    }

    public void frenar(int decremento) {
        velocidadActual -= decremento;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }

    public void imprimir() {
        System.out.println("Velocidad actual: " + velocidadActual);
        System.out.println("Velocidad máxima: " + velocidadMaxima);
    }
}