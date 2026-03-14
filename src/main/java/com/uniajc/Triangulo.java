package com.uniajc;

import com.uniajc.interfaces.IFigura;

public class Triangulo implements IFigura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // Para un triángulo equilátero, el perímetro es 3 veces la base
        return 3 * base;
    }

}
