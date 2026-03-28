package com.uniajc.ejercicio1_animales;

public abstract class Mamifero {

    public abstract void amamantarCrias();

    public String tipoAnimal() {
        return "Mamífero";
    }

    public boolean tieneLeche() {
        return true;
    }
}