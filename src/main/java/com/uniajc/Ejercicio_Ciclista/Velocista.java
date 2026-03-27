package com.uniajc.Ejercicio_Ciclista;

public class Velocista extends Ciclista {
    private double potencia;
    private double velocidad;

    public Velocista(int id, String nombre, double potencia, double velocidad) {
        super(id, nombre);
        this.potencia = potencia;
        this.velocidad = velocidad;
    }

    @Override
    public String tipo() { return "Velocista"; }
}
