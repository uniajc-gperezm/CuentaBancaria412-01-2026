package com.uniajc.ejercicio1_animales;

public class PruebaAnimales {

    public static void main(String[] args) {
        Ballena ballena = new Ballena();
        Ornitorrinco ornitorrinco = new Ornitorrinco();

        System.out.println("=== BALLENA ===");
        System.out.println("Nombre: " + ballena.mostrarNombre());
        System.out.println("Tipo: " + ballena.tipoAnimal());
        ballena.amamantarCrias();

        System.out.println("\n=== ORNITORRINCO ===");
        System.out.println("Nombre: " + ornitorrinco.mostrarNombre());
        System.out.println("Tipo: " + ornitorrinco.tipoAnimal());
        System.out.println("¿Es ovíparo?: " + ornitorrinco.esOviparo());
        ornitorrinco.amamantarCrias();
        ornitorrinco.ponerHuevos();

        System.out.println("\nSistema de animales ejecutado correctamente.");
    }
}