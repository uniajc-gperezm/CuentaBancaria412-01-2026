package com.uniajc.ejercicio2_interface;

public class Main {

    public static void main(String[] args) {

        VehiculoTerrestre camioneta = new VehiculoTerrestre(180, 4, "Civil");
        VehiculoAcuatico motoAcuatica = new VehiculoAcuatico(120, "Superficie", 2);

        
        camioneta.acelerar(50);
        camioneta.imprimir();
        camioneta.mostrarDatos();

        int revoluciones = camioneta.calcularRevolucionesMotor(10, 5);
        System.out.println("Revoluciones: " + revoluciones);

        System.out.println("------------------");

    
        motoAcuatica.acelerar(60);
        motoAcuatica.recomendarVelocidad(90);
        motoAcuatica.imprimir();
        motoAcuatica.mostrarDatos();
    }
}