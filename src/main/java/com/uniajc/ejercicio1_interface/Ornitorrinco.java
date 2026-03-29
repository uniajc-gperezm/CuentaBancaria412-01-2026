package com.uniajc.ejercicio1_interface;

public class Ornitorrinco extends Mamifero implements Oviparo {

    @Override
    public void amamantarCrias() {
        System.out.println("El ornitorrinco amamanta a sus crías");
    }

    @Override
    public void ponerHuevos() {
        System.out.println("El ornitorrinco pone huevos");
    }

}