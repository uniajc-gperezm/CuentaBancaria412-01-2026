package com.uniajc.ejercicio_abstracto;

public class Escalador extends Ciclista {

    private float aceleracionPromedio;
    private float gradoRampa;

    public Escalador(int identificador, String nombre, float aceleracionPromedio, float gradoRampa) {
        super(identificador, nombre, 300);
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
        System.out.println("El ciclista es un Escalador");
        return "Escalador";
    }

    @Override
    public void ImprimirDatos() {
        super.ImprimirDatos();
        System.out.println("Aceleración promedio: " + aceleracionPromedio + " m/s²");
        System.out.println("Grado de rampa: " + gradoRampa + " grados");
    }

}
