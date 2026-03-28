package com.uniajc.ejercicio1_interfaces;

public class ejericioInterfaces1 {
    public static void main(String[] args) {
        Ballena ballena = new Ballena();
        Ornitorrinco ornitorrinco = new Ornitorrinco();

        System.out.println("=== Ballena ===");
        ballena.amamantarCrias();

        System.out.println("\n=== Ornitorrinco ===");
        ornitorrinco.amamantarCrias();
        ornitorrinco.ponerHuevos();
    }
}
