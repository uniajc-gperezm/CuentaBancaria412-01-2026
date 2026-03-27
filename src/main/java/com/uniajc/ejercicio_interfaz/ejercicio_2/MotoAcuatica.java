package com.uniajc.ejercicio_interfaz.ejercicio_2;

public class MotoAcuatica extends VehiculoAcuatico {

    private String motor;

    public MotoAcuatica(int velocidadActual, int velocidadMaxima, String tipo, int capacidadPasajeros, String motor) {
        super(velocidadActual, velocidadMaxima, tipo, capacidadPasajeros);
        this.motor = motor;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
        System.out.println("Motor: " + motor);
    }
}