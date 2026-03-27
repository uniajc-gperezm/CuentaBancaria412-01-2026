package com.uniajc.ejercicio2_interface;

public class VehiculoTerrestre extends Vehiculo implements Motor {

    private int cantidadLlantas;
    private String uso;

    public VehiculoTerrestre(int velocidadMaxima, int cantidadLlantas, String uso) {
        super(velocidadMaxima);
        this.cantidadLlantas = cantidadLlantas;
        this.uso = uso;
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }

    public void mostrarDatos() {
        System.out.println("Llantas: " + cantidadLlantas);
        System.out.println("Uso: " + uso);
    }
}
