package com.uniajc.ejercicio_abstracto;
public class Velocista extends Ciclista {

    private double potenciaPromedio;
    private double velocidadPromediSprint;

    public Velocista(int id, String nombre, double potencia, double velocidad) {
        super(id, nombre);
        this.potenciaPromedio = potencia;
        this.velocidadPromediSprint = velocidad;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromediSprint() {
        return velocidadPromediSprint;
    }

    public void setVelocidadPromediSprint(double velocidadPromediSprint) {
        this.velocidadPromediSprint = velocidadPromediSprint;
    }

    @Override
    public String imprimirTipo() {
        return "Velocista";
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Potencia Promedio: " + potenciaPromedio);
        System.out.println("Velocidad Promedio Sprint: " + velocidadPromediSprint);
    }
}