package com.uniajc.ejercicio_abstracto;

public class Velocista extends Ciclista {

    private double potenciaPromedio;
    private double velocidadPromedioSprint;

    public Velocista(int id, String nombre, double potencia, double velocidad) {
        super(id, nombre);
        this.potenciaPromedio = potencia;
        this.velocidadPromedioSprint = velocidad;
    }

    @Override
    public String imprimirTipo() {
        return "Velocista";
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Potencia promedio: " + potenciaPromedio);
        System.out.println("Velocidad promedio sprint: " + velocidadPromedioSprint);
    }
}