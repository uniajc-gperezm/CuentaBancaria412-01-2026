package com.uniajc.ejercicio2_interfaces;

public class Acuatico extends Vehiculo implements Motor, Vela {

    public Acuatico(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
    }

    @Override
    public void acelerar(int velocidad) {
        if (velocidadActual + velocidad <= velocidadMaxima) {
            velocidadActual += velocidad;
        } else {
            velocidadActual = velocidadMaxima;
        }
    }

    @Override
    public void frenar(int velocidad) {
        if (velocidadActual - velocidad >= 0) {
            velocidadActual -= velocidad;
        } else {
            velocidadActual = 0;
        }
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }

    @Override
    public void recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80 || velocidadViento < 10) {
            System.out.println("No se recomienda navegar. Velocidad a 0.");
            this.velocidadActual = 0;
        } else {
            System.out.println("Viento seguro para navegar.");
        }
    }
}