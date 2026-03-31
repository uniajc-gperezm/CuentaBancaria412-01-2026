package com.uniajc.ejercicio2_interfaces;

public class Main {
    public static void main(String[] args) {

        Terrestre camioneta = new Terrestre(50, 150);
        Acuatico motoAcuatica = new Acuatico(50, 110);

        System.out.println("--- CAMIONETA ---");
        camioneta.acelerar(20);
        camioneta.imprimir();
        System.out.println("Revoluciones: " + camioneta.calcularRevolucionesMotor(10, 5));

        System.out.println("\n--- MOTO ACUATICA ---");
        motoAcuatica.frenar(10);
        motoAcuatica.recomendarVelocidad(90);
        motoAcuatica.imprimir();
    }
}