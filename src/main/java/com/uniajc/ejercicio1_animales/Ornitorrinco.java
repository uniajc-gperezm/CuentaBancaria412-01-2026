package com.uniajc.ejercicio1_animales;

public class Ornitorrinco extends Mamifero implements Oviparo {

    public Ornitorrinco() {
        this.nombreComun = "Ornitorrinco";
    }

    @Override
    public void amamantarCrias() {
        System.out.println("El ornitorrinco amamanta a sus crías.");
    }

    @Override
    public void ponerHuevos() {
        System.out.println("El ornitorrinco pone huevos.");
    }

    @Override
    public String tipoReproduccion() {
        return "Ovíparo";
    }

    public String habitat() {
        return "Ríos y lagos";
    }
}