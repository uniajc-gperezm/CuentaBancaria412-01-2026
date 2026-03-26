package com.uniajc.ejercicio_abstracto;

public class Escalador extends Ciclista {
    private float aceleracionPromedio;
    private float gradoRampa;

    public Escalador(int id, String nombre, float aceleracion, float grado) {  
        super(id, nombre);
        this.aceleracionPromedio = aceleracion;
        this.gradoRampa = grado;
    }

    public String imprimirTipo() {
        return "Es un escalador";
    }

    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Aceleración: " + aceleracionPromedio);
        System.out.println("Grado rampa: " + gradoRampa);

        System.out.println("Mostrando datos del escalador...");
    }
}