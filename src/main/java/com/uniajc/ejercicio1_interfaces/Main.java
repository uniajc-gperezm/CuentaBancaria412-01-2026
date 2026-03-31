package com.uniajc.ejercicio1_interfaces;

public class Main {
    public static void main(String[] args) {
        Ballena ballena = new Ballena();
        ballena.amamantarCrias();

        Ornitorrinco ornitorrinco = new Ornitorrinco();
        ornitorrinco.amamantarCrias();
        ornitorrinco.ponerHuevos();
    }
}