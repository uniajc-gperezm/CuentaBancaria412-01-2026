package com.uniajc.interfaces2;

public class VehiculoAcuatico extends Vehiculo implements Vela {

    private String tipo;
    private int capacidad;

    public VehiculoAcuatico(int velocidadMaxima, String tipo, int capacidad) {
        super(velocidadMaxima);
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    @Override
    public void recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80) {
            System.out.println("Viento muy fuerte, no navegar");
            velocidadActual = 0;
        } else if (velocidadViento < 10) {
            System.out.println("Viento muy bajo, no navegar");
        } else {
            System.out.println("Condiciones adecuadas para navegar");
        }
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad: " + capacidad);
    }
}