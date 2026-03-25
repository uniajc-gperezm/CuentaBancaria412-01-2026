package com.uniajc.ejercicio_abstracto;

public class Velocista extends Ciclista {

    private double potenciaPromedio;
    private double VelocidadPromedioSprint;

    public Velocista(int identificador, String nombre, int tiempoAcomulado, double potenciaPromedio, double velocidadPromedioSprint) {
        super(identificador, nombre, tiempoAcomulado);
        this.potenciaPromedio = potenciaPromedio;
        this.VelocidadPromedioSprint = velocidadPromedioSprint;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedioSprint() {
        return VelocidadPromedioSprint;
    }

    public void setVelocidadPromedioSprint(double velocidadPromedioSprint) {
        VelocidadPromedioSprint = velocidadPromedioSprint;
    }

    @Override
    public String imprimirTipo() {
        return "Velocista";
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Potencia Promedio: " + potenciaPromedio);
        System.out.println("Velocidad Promedio Sprint: " + VelocidadPromedioSprint);
    }

    
    
}
