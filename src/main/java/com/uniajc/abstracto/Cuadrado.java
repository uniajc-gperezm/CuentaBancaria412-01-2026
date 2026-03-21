package com.uniajc.abstracto;

public class Cuadrado extends Figura {
  
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

}
