package com.uniajc.ejercicio2_interfaces;

public class Terrestre extends Vehiculo implements IMotor {

    public int numeroRuedas;
    public String usoVehiculo;

    public Terrestre(int numeroRuedas, String usoVehiculo) {
        super(0, 200);
        this.numeroRuedas = numeroRuedas;
        this.usoVehiculo = usoVehiculo;
    }

    public void calcularRevolucionesMotor(int fuerza, int radio) {
        int revoluciones = fuerza * radio;
        System.out.println("Revoluciones del motor: " + revoluciones);
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
        System.out.println("\n" + "Información del vehículo terrestre:");
        System.out.println("Número de ruedas: " + numeroRuedas);
        System.out.println("Uso del vehículo: " + usoVehiculo);
        System.out.println("Velocidad actual: " + velocidadActual);
        System.out.println("Velocidad máxima: " + velocidadMaxima);
    }

}
