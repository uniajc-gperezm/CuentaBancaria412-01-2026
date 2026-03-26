package com.uniajc.ejercicio_abstracto;
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
        System.out.println("Aceleración Promedio: " + aceleracionPromedio);
        System.out.println("Grado de Rampa: " + gradoRampa);
    }
}