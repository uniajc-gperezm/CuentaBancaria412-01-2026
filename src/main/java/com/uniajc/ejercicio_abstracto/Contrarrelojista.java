package com.uniajc.ejercicio_abstracto;

public class Contrarrelojista extends Ciclista {

   private double velocidadMaxima;

    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre, 400); 
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String imprimirTipo() {
        System.out.println("El ciclista es un Contrarrelojista");
        return "Contrarrelojista";
    }

    @Override
    public void ImprimirDatos() {
        super.ImprimirDatos();
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
    }


}
