package com.uniajc.Ejercicio_Ciclista;

public class Contrarrelojista extends Ciclista {
    private double velMax;

    public Contrarrelojista(int id, String nombre, double velMax) {
        super(id, nombre);
        this.velMax = velMax;
    }

    @Override
    public String tipo() { return "Contrarrelojista"; }
}
