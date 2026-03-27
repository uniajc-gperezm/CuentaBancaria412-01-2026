package com.uniajc.ejercicio2_interfaces;

public class Terrestre extends Vehiculo implements Motor {

    private int cantidadDeLlantas;
    private String uso;

    public Terrestre(int velocidadActual, int velocidadMaxima, int llantas, String uso) {

        super(velocidadActual, velocidadMaxima);
        this.cantidadDeLlantas = llantas;
        this.uso = uso;

    }

    @Override
    
    public void acelerar(int velocidad) {

        velocidadActual += velocidad;

        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
    }

    @Override

    public void frenar(int velocidad) {

        velocidadActual -= velocidad;

        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }

    @Override

    public int calcularRevolucionesMotor(int fuerza, int radio) {

        return (fuerza * radio);
    }

    @Override

    public void imprimir() {

        super.imprimir();

        System.out.println("Cantidad de llantas; " + cantidadDeLlantas);
        System.out.println("USo: " + uso);
    }
}