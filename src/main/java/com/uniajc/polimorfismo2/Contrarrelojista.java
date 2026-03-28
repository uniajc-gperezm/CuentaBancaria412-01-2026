package com.uniajc.polimorfismo2;

public class Contrarrelojista extends Ciclista {

    private double velocidadMaxima;

    public Contrarrelojista(int identificador, String nombre, double tiempo,
                            double velocidadMaxima) {
        super(identificador, nombre, tiempo);
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Velocidad máxima: " + velocidadMaxima);
    }
}
