package com.uniajc.polimorfismo2;

public class Velocista extends Ciclista {

    private double potenciaPromedio;
    private double velocidadPromedio;

    public Velocista(int identificador, String nombre, double tiempo,
                     double potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombre, tiempo);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Potencia promedio: " + potenciaPromedio);
        System.out.println("Velocidad promedio: " + velocidadPromedio);
    }
}
