package com.uniajc.ejercicio1_interface;

public class Main {

    public static void main(String[] args) {

        Ballena ballena = new Ballena();
        Ornitorrinco ornitorrinco = new Ornitorrinco();

        ballena.amamantarCrias();

        ornitorrinco.amamantarCrias();
        ornitorrinco.ponerHuevos();
    }
}