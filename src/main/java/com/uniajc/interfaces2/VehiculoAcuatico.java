package com.uniajc.interfaces2;

public class VehiculoAcuatico implements Vehiculo, Vela {

    private int velocidad = 0;

    @Override
    public void acelerar(int incremento) {
        velocidad += incremento;
    }

    @Override
    public void imprimir() {
        System.out.println("Velocidad: " + velocidad);
    }

    @Override
    public void recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80) {
            System.out.println("Viento muy fuerte, no navegar");
        } else {
            System.out.println("Navegación normal");
        }
    }
}