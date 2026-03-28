package com.uniajc.interfaces2;

public class Ornitorrinco extends Mamifero implements Oviparo {

    @Override
    public void amamantar() {
        System.out.println("El ornitorrinco amamanta a sus crías");
    }

    @Override
    public void ponerHuevos() {
        System.out.println("El ornitorrinco pone huevos");
    }
}