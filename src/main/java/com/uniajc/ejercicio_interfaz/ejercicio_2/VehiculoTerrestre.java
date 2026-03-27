package com.uniajc.ejercicio_interfaz.ejercicio_2;

public class VehiculoTerrestre extends Vehiculo implements Motor {

    protected int numeroLlantas;
    protected String uso; // militar o civil

    public VehiculoTerrestre(int velocidadActual, int velocidadMaxima, int numeroLlantas, String uso) {
        super(velocidadActual, velocidadMaxima);
        this.numeroLlantas = numeroLlantas;
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
        return fuerza * radio;
    }
}