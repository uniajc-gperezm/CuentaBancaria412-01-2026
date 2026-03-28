package com.uniajc.ejercicio2_interfaces;

public class Terrestre extends Vehiculo implements Motor {
    private int cantidadLlantas;
    private String uso; // "militar" o "civil"

    public Terrestre(double velocidadActual, double velocidadMaxima, int cantidadLlantas, String uso) {
        super(velocidadActual, velocidadMaxima);
        this.cantidadLlantas = Math.max(0, cantidadLlantas);
        this.uso = uso;
    }

    public int getCantidadLlantas() {
        return cantidadLlantas;
    }

    public String getUso() {
        return uso;
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        int revoluciones = fuerza * radio;
        System.out.println("Revoluciones del motor: " + revoluciones);
        return revoluciones;
    }

    @Override
    public void imprimir() {
        System.out.println("--- Vehículo terrestre ---");
        super.imprimir();
        System.out.println("Cantidad de llantas: " + cantidadLlantas);
        System.out.println("Uso: " + uso);
    }
}
