package com.uniajc.ejercicio_interfaz.ejercicio_2;

public class VehiculoAcuatico extends Vehiculo implements Vela {

    protected String tipo; // superficie o submarino
    protected int capacidadPasajeros;

    public VehiculoAcuatico(int velocidadActual, int velocidadMaxima, String tipo, int capacidadPasajeros) {
        super(velocidadActual, velocidadMaxima);
        this.tipo = tipo;
        this.capacidadPasajeros = capacidadPasajeros;
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
    public void recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80) {
            velocidadActual = 0;
            System.out.println("El viento es muy alto. No se recomienda navegar.");
        } else if (velocidadViento < 10) {
            velocidadActual = 0;
            System.out.println("El viento es muy bajo. No se recomienda navegar.");
        } else {
            System.out.println("La velocidad del viento es adecuada para navegar.");
        }
    }
}