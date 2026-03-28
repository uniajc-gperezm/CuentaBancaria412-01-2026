package com.uniajc.ejercicio_abstracto;

public class Contrarrelojista extends Ciclista {

    private double velocidadMaxima;

    public Contrarrelojista(int id, String nombre, double velocidadMaxima) {
        super(id, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String imprimirTipo() {
        return "Contrarrelojista";
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Velocidad máxima: " + velocidadMaxima);
    }
}