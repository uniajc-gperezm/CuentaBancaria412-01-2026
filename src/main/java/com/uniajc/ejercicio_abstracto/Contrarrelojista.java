package com.uniajc.ejercicio_abstracto;

public class Contrarrelojista extends Ciclista {
    private double velocidadMaxima;

    public Contrarrelojista(int identificador, String nombre, int tiempoAcumulado, double velocidadMaxima) {
        super(identificador, nombre, tiempoAcumulado);
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Velocidad máxima: " + velocidadMaxima + " Km/h");
    }

    @Override
    public String imprimirTipo() {
        return "Es un Contrarrelojista";
    }
}
