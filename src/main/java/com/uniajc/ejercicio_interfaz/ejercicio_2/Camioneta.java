package com.uniajc.ejercicio_interfaz.ejercicio_2;

public class Camioneta extends VehiculoTerrestre {

    private int peso;

    public Camioneta(int velocidadActual, int velocidadMaxima, int numeroLlantas, String uso, int peso) {
        super(velocidadActual, velocidadMaxima, numeroLlantas, uso);
        this.peso = peso;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Numero de llantas: " + numeroLlantas);
        System.out.println("Uso: " + uso);
        System.out.println("Peso: " + peso + " kg");
    }
}