package com.uniajc.Ejercicio_Interfaces.EJERCICIO1;

public class Principal {
    public static void main(String[] args) {
        
        Ballena miBallena = new Ballena();
        
        Ornitorrinco miOrnitorrinco = new Ornitorrinco();

        System.out.println("--- Datos de la Ballena ---");
        miBallena.amamantarCrias();
        
        System.out.println("\n--- Datos del Ornitorrinco ---");
        miOrnitorrinco.amamantarCrias();
        miOrnitorrinco.ponerHuevos();
    }
}
