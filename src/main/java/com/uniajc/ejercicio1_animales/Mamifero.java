package com.uniajc.ejercicio1_animales;

public abstract class Mamifero {

    protected String nombreComun;

    public Mamifero() {
        this.nombreComun = "Mamífero";
    }

    public abstract void amamantarCrias();

    public String tipoAnimal() {
        return "Mamífero";
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }
}