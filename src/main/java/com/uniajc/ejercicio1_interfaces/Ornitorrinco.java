package com.uniajc.ejercicio1_interfaces;
import com.uniajc.ejercicio1_interfaces.interfaces.IOviparo;

public class Ornitorrinco extends Mamifero implements IOviparo {
    
    @Override
    protected void amamantarCrias() {
        System.out.println("El ornitorrinco amamanta a sus crías.");
    }

    @Override
    public void ponerHuevos() {
        System.out.println("El ornitorrinco pone huevos.");
    }
}