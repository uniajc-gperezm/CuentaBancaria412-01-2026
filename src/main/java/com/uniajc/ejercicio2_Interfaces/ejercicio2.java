package com.uniajc.ejercicio2_Interfaces;

public class ejercicio2 {
    public static void main(String[] args) {
        Camioneta cami = new Camioneta(20, 160, 4, "civil");
        System.out.println("Camioneta:");
        cami.acelerar(30);
        cami.frenar(10);
        cami.imprimir();
        System.out.println("Revoluciones motor: " + cami.calcularRevolucionesMotor(5, 3));

        System.out.println();

        MotoAcuatica moto = new MotoAcuatica(15, 90, "superficie", 2);
        System.out.println("Moto acuatica:");
        moto.acelerar(25);
        moto.frenar(5);
        moto.imprimir();
        int velRecom = moto.recomendarVelocidad(50);
        System.out.println("Velocidad recomendada por viento: " + velRecom);
        moto.imprimir();
    }
}
