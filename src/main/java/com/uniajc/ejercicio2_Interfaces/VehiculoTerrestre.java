package com.uniajc.ejercicio2_Interfaces;

public class VehiculoTerrestre extends Vehiculo implements Motor {
    protected int cantidadLlantas;
    protected String uso;

    public VehiculoTerrestre(int velocidadActual, int velocidadMaxima, int cantidadLlantas, String uso) {
        super(velocidadActual, velocidadMaxima);
        this.cantidadLlantas = cantidadLlantas;
        this.uso = uso;
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
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }
}
