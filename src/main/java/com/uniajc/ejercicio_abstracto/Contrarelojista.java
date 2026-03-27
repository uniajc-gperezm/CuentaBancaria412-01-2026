package com.uniajc.ejercicio_abstracto;

public class Contrarelojista extends Ciclista {

    private double velocidadMaxima;

    public Contrarelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
    }

    @Override
    public String imprimirTipo() {
        return "Es un Contrarelojista";
    }
}