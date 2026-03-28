package com.uniajc.ejercicio1_animales;

public class Ornitorrinco extends Mamifero implements Oviparo {

    @Override
    public void amamantarCrias() {
        System.out.println("El ornitorrinco amamanta a sus crías.");
    }

    @Override
    public void ponerHuevos() {
        System.out.println("El ornitorrinco pone huevos.");
    }

    @Override
    public boolean esOviparo() {
        return true;
    }

    @Override
    public int cantidadHuevos() {
        return 2;
    }

   
}