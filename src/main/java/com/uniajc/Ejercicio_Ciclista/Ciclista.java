package com.uniajc.Ejercicio_Ciclista;

public abstract class Ciclista {
    private int id;
    private String nombre;
    private int tiempo;

    public Ciclista(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.tiempo = 0;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getTiempo() { return tiempo; }
    public void setTiempo(int tiempo) { this.tiempo = tiempo; }

    public abstract String tipo();

    public void mostrar() {
        System.out.println(id + " - " + nombre + " (" + tipo() + ") - Tiempo: " + tiempo);
    }
}