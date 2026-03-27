package com.uniajc.ejercicio2_interfaces;

public class Acuatico extends Vehiculo implements Vela {
    private String tipo; // "superficie" o "submarino"
    private int capacidadPasajeros;

    public Acuatico(double velocidadActual, double velocidadMaxima, String tipo, int capacidadPasajeros) {
        super(velocidadActual, velocidadMaxima);
        this.tipo = tipo;
        this.capacidadPasajeros = Math.max(0, capacidadPasajeros);
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    @Override
    public void recomendarVelocidad(int velocidadViento) {
        System.out.println("Velocidad del viento: " + velocidadViento + " km/h");
        if (velocidadViento > 80) {
            velocidadActual = 0;
            System.out.println("Viento muy alto (> 80 km/h): no salir a navegar, velocidad actual = 0");
        } else if (velocidadViento < 10) {
            System.out.println("Viento muy bajo (< 10 km/h): no recomendable salir a navegar");
        } else {
            System.out.println("Condiciones aptas: navegar con precaución");
        }
    }

    @Override
    public void imprimir() {
        System.out.println("--- Vehículo acuático ---");
        super.imprimir();
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad pasajeros: " + capacidadPasajeros);
    }
}
