package com.uniajc.EjercicioabstractoD;

public class Velocista extends Ciclista {

    private double potenciaPromedio;
    private double velocidadPromedio;

    public Velocista(int id, String nombre, double potencia, double velocidad) {
        super(id, nombre);
        this.potenciaPromedio = potencia;
        this.velocidadPromedio = velocidad;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    @Override
    public String imprimirTipo() {
        return "Es un Velocista";
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Potencia promedio: " + potenciaPromedio);
        System.out.println("Velocidad promedio sprint: " + velocidadPromedio);
    }
}