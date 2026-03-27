package com.uniajc.abstracto;

public class Contrarrelojista extends Ciclista {

    private double velocidadMaxima;

    public Contrarrelojista(int id, String nombre, double velocidadMaxima) {
        super(id, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String imprimirTipo() {
        return "Es un Contrarrelojista";
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Velocidad maxima: " + velocidadMaxima);
    }
}