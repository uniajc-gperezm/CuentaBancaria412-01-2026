package com.uniajc.Ejercicio_Interfaces.EJERCICIO1;

public class Ornitorrinco extends Mamifero implements Oviparo {
    @Override
    protected void amamantarCrias() {
        System.out.println("El ornitorrinco amamanta a sus crias");
    }

    @Override
    public void ponerHuevos() {
        System.out.println("El ornitorrinco pone huevos");
    }
}