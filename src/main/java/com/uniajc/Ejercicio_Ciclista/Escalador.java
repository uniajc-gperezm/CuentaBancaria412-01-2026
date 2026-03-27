package com.uniajc.Ejercicio_Ciclista;

public class Escalador extends Ciclista {
    private float aceleracion;
    private float grado;

    public Escalador(int id, String nombre, float aceleracion, float grado) {
        super(id, nombre);
        this.aceleracion = aceleracion;
        this.grado = grado;
    }

    @Override
    public String tipo() { return "Escalador"; }
}