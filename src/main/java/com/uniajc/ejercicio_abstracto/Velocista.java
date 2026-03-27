package com.uniajc.ejercicio_abstracto;

public class Velocista extends Ciclista {

    private double potenciaPromedio;
    private double velocidadPromedioSprint;

    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedioSprint) {
        super(identificador, nombre, 200);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedioSprint() {
        return velocidadPromedioSprint;
    }

    public void setVelocidadPromedioSprint(double velocidadPromedioSprint) {
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }

    @Override
    public String imprimirTipo() {
        System.out.println("El ciclista es un Velocista");
        return "Velocista";
    }

    @Override
    public void ImprimirDatos() {
        super.ImprimirDatos();
        System.out.println("Potencia promedio: " + potenciaPromedio + " watts");
        System.out.println("Velocidad promedio en sprint: " + velocidadPromedioSprint + " km/h");
    }

}
