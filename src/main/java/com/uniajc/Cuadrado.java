package com.uniajc;

import com.uniajc.interfaces.*;

public class Cuadrado implements IFigura, IDibujable {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public int dibujar() {
        System.out.println("Dibujando un cuadrado de lado " + lado);
        return 0;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

}
