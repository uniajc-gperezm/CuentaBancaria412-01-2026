package com.uniajc.abstracto;

public class Escalador extends Ciclista {

    private float aceleracionPromedio;
    private float gradoRampa;

    public Escalador(int id, String nombre, float aceleracionPromedio, float gradoRampa) {
        super(id, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    @Override
    public String imprimirTipo() {
        return "Escalador";
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Aceleracion: " + aceleracionPromedio);
        System.out.println("Grado de rampa: " + gradoRampa);
    }
}