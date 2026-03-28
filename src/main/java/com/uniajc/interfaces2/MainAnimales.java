package com.uniajc.interfaces2;

public class MainAnimales {

    public static void main(String[] args) {

        Ballena b = new Ballena();
        Ornitorrinco o = new Ornitorrinco();

        b.amamantar();

        o.amamantar();
        o.ponerHuevos();
    }
}