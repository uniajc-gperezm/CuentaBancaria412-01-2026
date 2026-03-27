package com.uniajc.ejercicio2_interface;

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
            System.out.println("Viento muy fuerte, no salir a navegar");
            velocidadActual = 0;
        } else if (velocidadViento < 10) {
            System.out.println("Viento muy bajo, no se recomienda navegar");
        } else {
            System.out.println("Condiciones normales para navegar");
        }
    }

    public void mostrarDatos() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad: " + capacidad);
    }
}
