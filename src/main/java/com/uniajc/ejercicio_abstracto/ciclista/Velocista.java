package com.uniajc.ejercicio_abstracto.ciclista;

public class Velocista extends Ciclista {

    private double potenciaPromedio;
    private double velocidadPromedioSprint;

    public Velocista(int id, String nombre, double potencia, double velocidad) {
        super();
        this.potenciaPromedio = potencia;
        this.velocidadPromedioSprint = velocidad;
    }

    @Override
    public String imprimirTipo() {
        return "Es un Velocista";
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Potencia: " + potenciaPromedio);
        System.out.println("Velocidad Sprint: " + velocidadPromedioSprint);
    }
}