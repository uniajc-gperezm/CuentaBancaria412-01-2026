package com.uniajc.ejercicio2_interfaces;

public class Acuatico extends Vehiculo implements Vela {

    public String tipo;
    public int capacidadPasajeros;

    public Acuatico(String tipo, int capacidadPasajeros) {
        super(0, 110); // Llamada al constructor de la clase padre Vehiculo
        this.tipo = tipo;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public void recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80) {
            System.out.println("Velocidad del viento muy alta, se recomienda no navegar.");
        } else if (velocidadViento < 20) {
            System.out.println("Velocidad del viento muy baja, se recomienda no navegar.");
        } else {
            System.out.println("Navegue con tranquilidad :)");
        }
    }

    public void acelerar(int velocidadAnterior) {
        if (velocidadActual + velocidadAnterior > velocidadMaxima) {
            System.out.println("No se puede acelerar, se excede la velocidad máxima.");
        } else {
            velocidadActual += velocidadAnterior;

        }
    }

    public void frenar(int velocidadAnterior) {
        if (velocidadActual - velocidadAnterior < 0) {
            System.out.println("La velocidad actual no puede ser negativa");
        } else {
            velocidadActual -= velocidadAnterior;

        }
    }

    public void imprimir() {
        System.out.println("\n" + "Información del vehículo acuático:");
        System.out.println("Tipo de vehículo acuático: " + tipo);
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
        System.out.println("Velocidad actual: " + velocidadActual);
        System.out.println("Velocidad máxima: " + velocidadMaxima);
    }

}