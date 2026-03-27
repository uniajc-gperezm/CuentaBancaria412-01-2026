package com.uniajc.Ejercicio1_Interfaz;

import com.uniajc.Ejercicio1_Interfaz.Interfaz.Oviparo;

public class Ornitorrinco extends Mamifero implements Oviparo {

    @Override
    protected void amamantarCrias() {
        System.out.println("El ornitorrinco amamanta a sus crías.");
    }

    @Override
    public void ponerHuevos() {
        System.out.println("El ornitorrinco pone huevos.");
    }
    
}
