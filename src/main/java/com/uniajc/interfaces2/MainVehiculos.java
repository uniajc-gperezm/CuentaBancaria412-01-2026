package com.uniajc.interfaces2;

public class MainVehiculos {

    public static void main(String[] args) {

        VehiculoTerrestre carro = new VehiculoTerrestre();
        carro.acelerar(50);
        carro.imprimir();

        System.out.println("----------------");

        VehiculoAcuatico lancha = new VehiculoAcuatico();
        lancha.acelerar(30);
        lancha.recomendarVelocidad(70);
        lancha.imprimir();
    }
}
