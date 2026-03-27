package com.uniajc.ejercicio2_Interfaces;

public class VehiculoAcuatico extends Vehiculo implements Vela {
    protected String tipo;
    protected int capacidadPasajeros;

    public VehiculoAcuatico(int velocidadActual, int velocidadMaxima, String tipo, int capacidadPasajeros) {
        super(velocidadActual, velocidadMaxima);
        this.tipo = tipo;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public void acelerar(int incremento) {
        velocidadActual = velocidadActual + incremento;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
    }

    @Override
    public void frenar(int decremento) {
        velocidadActual = velocidadActual - decremento;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }

    @Override
    public int recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80) {
            velocidadActual = 0;
            return 0;
        }
        if (velocidadViento < 10) {
            velocidadActual = 0;
            return 0;
        }
        return velocidadViento;
    }
}
