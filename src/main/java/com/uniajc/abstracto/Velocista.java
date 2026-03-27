package com.uniajc.abstracto;

public class Velocista extends Ciclista {

    private double potenciaPromedio;
    private double velocidadSprint;

    public Velocista(int id, String nombre, double potenciaPromedio, double velocidadSprint) {
        super(id, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadSprint = velocidadSprint;
    }

    @Override
    public String imprimirTipo() {
        return "Es un Velocista";
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Potencia promedio: " + potenciaPromedio);
        System.out.println("Velocidad sprint: " + velocidadSprint);
    }
}