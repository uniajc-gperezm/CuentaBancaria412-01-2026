package com.uniajc.ejercicio2_interfaces;

public class Main {

    public static void main(String[] args) {

        Terrestre carro = new Terrestre(50, 20, 4, "Ciudadano");

        carro.acelerar(30);
        carro.frenar(20);
        carro.imprimir();

        int revoluciones = carro.calcularRevolucionesMotor(10, 5);
        System.out.println("Las revoluciones del motor son: " + revoluciones);

        Acuatico lancha = new Acuatico(50, 110, "Mar mediano", 2);
        lancha.acelerar(40);
        lancha.recomendarVelocidad(85);
        lancha.imprimir();

    }
}