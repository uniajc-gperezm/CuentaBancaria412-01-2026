package com.uniajc.EjercicioabstractoD;

public class Escalador extends Ciclista {

    private float aceleracionPromedio;
    private float gradoRampa;

    public Escalador(int id, String nombre, float aceleracion, float grado) {
        super(id, nombre);
        this.aceleracionPromedio = aceleracion;
        this.gradoRampa = grado;
    }

    public float getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    public float getGradoRampa() {
        return gradoRampa;
    }

    @Override
    public String imprimirTipo() {
        return "Es un Escalador";
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Aceleración promedio: " + aceleracionPromedio);
        System.out.println("Grado de rampa: " + gradoRampa);
    }
}