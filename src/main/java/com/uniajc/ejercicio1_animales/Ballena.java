package com.uniajc.ejercicio1_animales;

public class Ballena extends Mamifero {

    public Ballena() {
        this.nombreComun = "Ballena";
    }

    @Override
    public void amamantarCrias() {
        System.out.println("La ballena amamanta a sus crías.");
    }

    public String habitat() {
        return "Océano";
    }
}