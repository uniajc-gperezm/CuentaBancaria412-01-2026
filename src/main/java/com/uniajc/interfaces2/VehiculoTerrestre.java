package com.uniajc.interfaces2;

public class VehiculoTerrestre extends Vehiculo implements Motor {

    private int llantas;
    private String uso;

    public VehiculoTerrestre(int velocidadMaxima, int llantas, String uso) {
        super(velocidadMaxima);
        this.llantas = llantas;
        this.uso = uso;
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Llantas: " + llantas);
        System.out.println("Uso: " + uso);
    }
}