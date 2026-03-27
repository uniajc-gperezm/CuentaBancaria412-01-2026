package com.uniajc.ejercicio2_interfaces;

public class Acuatico extends Vehiculo implements Vela {

    private String tipo;
    private int capacidadDePasajeros;

    public Acuatico(int velocidadActual, int velocidadMaxima, String tipo, int capacidad) {

        super(velocidadActual, velocidadMaxima);
        this.tipo = tipo;
        this.capacidadDePasajeros = capacidad;
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

    public void recomendarVelocidad(int velocidadDelViento) {

        if (velocidadDelViento > 80) {

            System.out.println("El viento está muy alto, no se recomienda navegar.");
            
            velocidadActual = 0;
        } else if (velocidadDelViento < 20) {

            System.out.println("Viento bajo, no se recomienda navegar.");
        } else {

            System.out.println("El viento está adecuado para navegar.");
        }
    }
}