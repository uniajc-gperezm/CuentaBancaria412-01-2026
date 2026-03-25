package com.uniajc.ejercicio_abstracto.ciclista;

public class Escalador extends Ciclista {

    private float aceleracionPromedio;
    private float gradoRampa;

    public Escalador(int id, String nombre, float aceleracion, float grado) {
        super();
        this.aceleracionPromedio = aceleracion;
        this.gradoRampa = grado;
    }

    @Override
    public String imprimirTipo() {
        return "Es un Escalador";
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Aceleración: " + aceleracionPromedio);
        System.out.println("Grado rampa: " + gradoRampa);
    }
}