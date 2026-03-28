package com.uniajc.interfaces2;

public class VehiculoTerrestre implements Vehiculo, Motor {

    private int velocidad = 0;

    @Override
    public void acelerar(int incremento) {
        velocidad += incremento;
    }

    @Override
    public void imprimir() {
        System.out.println("Velocidad: " + velocidad);
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }
}