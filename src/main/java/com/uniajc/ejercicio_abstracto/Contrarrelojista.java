package com.uniajc.ejercicio_abstracto;

public class Contrarrelojista extends Ciclista {

    private double velocidadMaxima;

    public Contrarrelojista(int id, String nombre, double velocidadMaxima) {
        super(id, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    public String imprimirTipo() {
        return "Es Contrarrelojista";
    }

    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Velocidad maxima: " + velocidadMaxima);
    }
}