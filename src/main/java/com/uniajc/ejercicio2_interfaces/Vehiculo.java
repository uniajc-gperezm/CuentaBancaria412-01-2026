package com.uniajc.ejercicio2_interfaces;

public abstract class Vehiculo {
    protected double velocidadActual;
    protected double velocidadMaxima;

    public Vehiculo(double velocidadActual, double velocidadMaxima) {
        this.velocidadActual = Math.max(0, velocidadActual);
        this.velocidadMaxima = Math.max(0, velocidadMaxima);
        if (this.velocidadActual > this.velocidadMaxima) {
            this.velocidadActual = this.velocidadMaxima;
        }
    }

    public void acelerar(double incremento) {
        if (incremento < 0) {
            System.out.println("Incremento inválido: no puede ser negativo");
            return;
        }
        velocidadActual += incremento;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
        System.out.println("Acelerando: velocidad actual = " + velocidadActual + " km/h");
    }

    public void frenar(double decremento) {
        if (decremento < 0) {
            System.out.println("Decremento inválido: no puede ser negativo");
            return;
        }
        velocidadActual -= decremento;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
        System.out.println("Frenando: velocidad actual = " + velocidadActual + " km/h");
    }

    public void imprimir() {
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
    }
}
