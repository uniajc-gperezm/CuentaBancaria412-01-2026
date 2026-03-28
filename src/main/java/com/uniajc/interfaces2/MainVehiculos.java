package com.uniajc.interfaces2;

public class MainVehiculos {

    public static void main(String[] args) {

        VehiculoTerrestre carro = new VehiculoTerrestre(120, 4, "Civil");
        carro.acelerar(50);
        carro.imprimir();

        System.out.println("Revoluciones del motor: " + carro.calcularRevolucionesMotor(10, 5));

        System.out.println("----------------------");

        VehiculoAcuatico lancha = new VehiculoAcuatico(80, "Superficie", 6);
        lancha.acelerar(30);
        lancha.recomendarVelocidad(90);
        lancha.imprimir();
    }
}

// entrega final