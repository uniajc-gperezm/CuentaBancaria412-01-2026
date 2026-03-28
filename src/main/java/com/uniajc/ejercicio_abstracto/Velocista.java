package com.uniajc.ejercicio_abstracto;

public class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadPromedioSprint;

    public Velocista(int identificador, String nombre, int tiempoAcumulado, double potenciaPromedio, double velocidadPromedioSprint) {
        super(identificador, nombre, tiempoAcumulado);
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
    public void imprimir() {
        super.imprimir();
        System.out.println("Potencia promedio: " + potenciaPromedio + " W");
        System.out.println("Velocidad promedio sprint: " + velocidadPromedioSprint + " Km/h");
    }

    @Override
    public String imprimirTipo() {
        return "Es un Velocista";
    }
}
