package com.uniajc.ejercicio2_vehiculos;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Terrestre camioneta = new Terrestre(50, 120, 4, "Civil");
        Acuatico motoAcuatica = new Acuatico(50, 110, "Superficie", 2);

        System.out.println("=== CAMIONETA ===");
        camioneta.imprimir();
        camioneta.acelerar(30);
        System.out.println("Después de acelerar:");
        camioneta.imprimir();
        camioneta.frenar(20);
        System.out.println("Después de frenar:");
        camioneta.imprimir();
        System.out.println("Revoluciones del motor: " + camioneta.calcularRevolucionesMotor(10, 5));

        System.out.println("\n=== MOTO ACUÁTICA ===");
        motoAcuatica.imprimir();
        motoAcuatica.acelerar(40);
        System.out.println("Después de acelerar:");
        motoAcuatica.imprimir();
        motoAcuatica.frenar(25);
        System.out.println("Después de frenar:");
        motoAcuatica.imprimir();
        motoAcuatica.recomendarVelocidad(50);

System.out.println("Ejecución del sistema de vehículos finalizada correctamente");
    }
}