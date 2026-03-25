package com.uniajc.ejercicio_abstracto;

public abstract class Ciclista {
    
    private int identificador;
    private String nombre;
    private int tiempoAcomulado;


    public Ciclista(int identificador, String nombre, int tiempoAcomulado) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcomulado = 0;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoAcomulado() {
        return tiempoAcomulado;
    }

    public void setTiempoAcomulado(int tiempoAcomulado) {
        this.tiempoAcomulado = tiempoAcomulado;
    }

    public abstract String imprimirTipo ();

    public void imprimirDatos() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo Acumulado: " + tiempoAcomulado);
    }
}
