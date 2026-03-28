package com.uniajc.ejercicio1_interfaces;

public class Ornitorrinco extends Mamifero implements Ovoparo {

    @Override
    public void amamentarCrias() {
        System.out.println("El ornitorrinco amamanta a sus crías");
    }

    @Override
    public void ponerHuevos() {
        System.out.println("El ornitorrinco pone huevos");
    }
}
