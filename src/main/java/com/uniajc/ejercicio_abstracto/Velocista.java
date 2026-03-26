package com.uniajc.ejercicio_abstracto;

public class Velocista extends Ciclista {
    
    private double potenciaPromedio;
    private double velocidadPromediSprint;

    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromediSprint) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromediSprint = velocidadPromediSprint;
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
        return "Es un Velocista";
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Potencia promedio: " + potenciaPromedio + " vatios");
        System.out.println("Velocidad promedio en sprint: " + velocidadPromediSprint + " Km/h");
    }
}