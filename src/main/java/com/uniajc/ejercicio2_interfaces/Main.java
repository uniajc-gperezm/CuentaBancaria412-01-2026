package com.uniajc.ejercicio2_interfaces;

public class Main {

    public static void main(String[] args) {

    Vehiculo camioneta = new Terrestre(4, "Militar");
    Vehiculo motoAcuatica = new Acuatico("Superficie", 2);

    camioneta.acelerar(100);
    camioneta.frenar(50);
    camioneta.imprimir();
    

    motoAcuatica.acelerar(80);
    motoAcuatica.frenar(30);
    motoAcuatica.imprimir();  
    

}

}