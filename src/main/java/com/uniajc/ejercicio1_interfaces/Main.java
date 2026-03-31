package com.uniajc.ejercicio1_interfaces;

public class Main {
    public static void main(String[] args) {

        Ballena animal1 = new Ballena();
        animal1.amamantarCrias();

        Ornitorrinco animal2 = new Ornitorrinco();
        animal2.amamantarCrias();
        animal2.ponerHuevos();
    }
}