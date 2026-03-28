package com.uniajc.ejercicio1_animales;

public class PruebaAnimales {

    public static void main(String[] args) {
        Ballena ballena = new Ballena();
        Ornitorrinco ornitorrinco = new Ornitorrinco();

        System.out.println("=== BALLENA ===");
        System.out.println("Nombre común: " + ballena.getNombreComun());
        System.out.println("Tipo: " + ballena.tipoAnimal());
        System.out.println("Hábitat: " + ballena.habitat());
        ballena.amamantarCrias();

        System.out.println("\n=== ORNITORRINCO ===");
        System.out.println("Nombre común: " + ornitorrinco.getNombreComun());
        System.out.println("Tipo: " + ornitorrinco.tipoAnimal());
        System.out.println("Tipo de reproducción: " + ornitorrinco.tipoReproduccion());
        System.out.println("Hábitat: " + ornitorrinco.habitat());
        ornitorrinco.amamantarCrias();
        ornitorrinco.ponerHuevos();

        System.out.println("\nSistema de animales ejecutado correctamente.");
    }
}