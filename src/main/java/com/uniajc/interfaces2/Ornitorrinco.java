package com.uniajc.interfaces2;

public class Ornitorrinco implements Mamifero, Oviparo {

    @Override
    public void amamantar() {
        System.out.println("El ornitorrinco amamanta a sus crias");
    }

    @Override
    public void ponerHuevos() {
        System.out.println("El ornitorrinco pone huevos");
    }
}
