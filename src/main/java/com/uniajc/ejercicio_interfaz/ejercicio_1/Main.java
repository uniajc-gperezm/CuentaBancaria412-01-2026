package com.uniajc.ejercicio_interfaz;

public class Main {

    public static void main(String[] args) {

        Ballena ballena = new Ballena();
        Ornitorrinco ornitorrinco = new Ornitorrinco();

        // Métodos de la ballena
        ballena.amamantarCrias();

        // Métodos del ornitorrinco
        ornitorrinco.amamantarCrias();
        ornitorrinco.ponerHuevos();
    }
}