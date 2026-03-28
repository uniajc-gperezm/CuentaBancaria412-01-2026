package com.uniajc.polimorfismo2;

public class Escalador extends Ciclista {

    private double aceleracionPromedio;
    private double gradoRampa;

    public Escalador(int identificador, String nombre, double tiempo,
                     double aceleracionPromedio, double gradoRampa) {
        super(identificador, nombre, tiempo);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Aceleración promedio: " + aceleracionPromedio);
        System.out.println("Grado de rampa: " + gradoRampa);
    }
}