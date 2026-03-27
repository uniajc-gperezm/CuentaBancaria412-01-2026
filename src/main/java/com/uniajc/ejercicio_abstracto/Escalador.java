package com.uniajc.ejercicio_abstracto;

public class Escalador extends Ciclista {
    private float aceleracionPromedio;
    private float gradoRampa;

    public Escalador(int identificador, String nombre, float aceleracionPromedio, float gradoRampa) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    public float getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    public void setAceleracionPromedio(float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    public float getGradoRampa() {
        return gradoRampa;
    }

    public void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    @Override
    public String imprimirTipo() {
        return "Escalador";
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Aceleracion promedio: " + aceleracionPromedio);
        System.out.println("Grado rampa: " + gradoRampa);
    }
}
