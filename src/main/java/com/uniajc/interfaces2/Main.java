package com.uniajc.interfaces2;

public class Main {

    public static void main(String[] args) {

        VehiculoTerrestre camioneta = new VehiculoTerrestre(120, 4, "Civil");
        VehiculoAcuatico lancha = new VehiculoAcuatico(80, "Superficie", 6);

        camioneta.acelerar(50);
        camioneta.frenar(10);
        camioneta.imprimir();

        int revoluciones = camioneta.calcularRevolucionesMotor(10, 5);
        System.out.println("Revoluciones: " + revoluciones);

        System.out.println("\n---");

        lancha.acelerar(40);
        lancha.recomendarVelocidad(90);
        lancha.imprimir();
    }
}