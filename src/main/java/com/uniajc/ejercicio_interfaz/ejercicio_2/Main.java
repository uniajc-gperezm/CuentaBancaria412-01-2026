package com.uniajc.ejercicio_interfaz.ejercicio_2;

public class Main {

    public static void main(String[] args) {

        // Crear objetos
        Camioneta camioneta = new Camioneta(60, 180, 4, "civil", 2000);
        MotoAcuatica moto = new MotoAcuatica(30, 120, "superficie", 2, "Yamaha");

        // Mostrar datos
        System.out.println("=== CAMIONETA ===");
        camioneta.imprimir();

        System.out.println("\n=== MOTO ACUATICA ===");
        moto.imprimir();

        // Probar métodos
        camioneta.acelerar(50);
        camioneta.frenar(30);

        moto.recomendarVelocidad(50); // viento normal
        moto.recomendarVelocidad(90); // viento alto
    }
}