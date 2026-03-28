package com.uniajc.EjercicioabstractoD;

public class Contrarrelojista extends Ciclista {

    private double velocidadMaxima;

    public Contrarrelojista(int id, String nombre, double velocidadMaxima) {
        super(id, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    @Override
    public String imprimirTipo() {
        return "Es un Contrarrelojista";
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Velocidad máxima: " + velocidadMaxima);
    }
}