package com.uniajc.interfaces2;

public class VehiculoTerrestre extends Vehiculo implements Motor {

    private int numeroLlantas;
    private String uso;

    public VehiculoTerrestre(int velocidadMaxima, int numeroLlantas, String uso) {
        super(velocidadMaxima);
        this.numeroLlantas = numeroLlantas;
        this.uso = uso;
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Numero de llantas: " + numeroLlantas);
        System.out.println("Uso: " + uso);
    }
}