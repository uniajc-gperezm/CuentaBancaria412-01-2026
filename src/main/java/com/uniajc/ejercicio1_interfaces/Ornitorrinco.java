package com.uniajc.ejercicio1_interfaces;

public class Ornitorrinco extends Mamiferos implements IOviparo {

    @Override
    public void amamantarCrias() {
        String info = "El ornitorrinco amamanta a sus crías aunque es diferente a otros mamíferos.";
        System.out.println(info);
    }

    @Override
    public void ponerHuevos() {
        String accion = "El ornitorrinco pone huevos como un animal ovíparo.";
        System.out.println(accion);
    }

}