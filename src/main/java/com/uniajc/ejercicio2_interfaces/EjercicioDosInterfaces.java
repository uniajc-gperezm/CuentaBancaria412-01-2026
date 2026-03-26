package com.uniajc.ejercicio2_interfaces;

public class EjercicioDosInterfaces {
    public static void main(String[] args) {

        Terrestre camioneta = new Terrestre(50, 180, 4, "Civil");
        Acuatico motoAcuatica = new Acuatico(50, 110, "Superficie", 2);

        System.out.println("========== Camioneta ==========");
        camioneta.imprimir();

        System.out.println("\n-- Acelerando --");
        camioneta.acelerar(60);
        int revolucionesAcelerando = camioneta.calcularRevolucionesMotor(5, 3);
        System.out.println("Revoluciones del motor: " +revolucionesAcelerando);

        System.out.println("\n-- Frenando --");
        camioneta.frenar(30);
        int revolucionesFrenando = camioneta.calcularRevolucionesMotor(4, 2);
        System.out.println("Revoluciones del motor: " +revolucionesFrenando);

        System.out.println("\n========== Moto Acuática ==========");
        motoAcuatica.imprimir();

        System.out.println("\n-- Revisando condiciones del viento antes de salir --");
        int viento1 = 85;
        System.out.println("Viento: " +viento1+ " km/h");
        motoAcuatica.recomendarVelocidad(viento1);

        int viento2 = 5;
        System.out.println("\nViento: " +viento2+ " km/h");
        motoAcuatica.recomendarVelocidad(viento2);

        int viento3 = 40;
        System.out.println("\nViento: " +viento3+ " km/h");
        motoAcuatica.recomendarVelocidad(viento3);

        System.out.println("\n-- Condiciones aptas, acelerando --");
        motoAcuatica.acelerar(30);
        int revolucionesMotoAcelerando = motoAcuatica.calcularRevolucionesMotor(3,2);
        System.out.println("Revoluciones del motor: " +revolucionesMotoAcelerando);

        System.out.println("\n-- Frenando --");
        motoAcuatica.frenar(10);
        int revolucionesMotoFrenando = motoAcuatica.calcularRevolucionesMotor(2, 2);
        System.out.println("Revoluciones del motor: " +revolucionesMotoFrenando);
    }
}