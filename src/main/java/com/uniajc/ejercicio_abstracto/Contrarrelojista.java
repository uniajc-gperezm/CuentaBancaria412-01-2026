package com.uniajc.ejercicio_abstracto;

public class Contrarrelojista extends Ciclista {
    private double velocidadMaxima;

    public Contrarrelojista(int id, String nombre, double velocidad) {
        super(id, nombre);
        this.velocidadMaxima = velocidad;
    }

    public String imprimirTipo() {
    return "Ciclista especializado en pruebas contrarreloj";
}

    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Velocidad máxima: " + velocidadMaxima);

        System.out.println("Mostrando datos del contrarrelojista...");
    }
}