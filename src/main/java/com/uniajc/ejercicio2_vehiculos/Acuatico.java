package com.uniajc.ejercicio2_vehiculos;

public class Acuatico extends Vehiculo implements Vela {
    private String tipo;
    private int capacidadPasajeros;

    public Acuatico(int velocidadActual, int velocidadMaxima, String tipo, int capacidadPasajeros) {
        super(velocidadActual, velocidadMaxima);
        this.tipo = tipo;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public boolean esDeAltaCapacidad() {
        return capacidadPasajeros > 5;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public void acelerar(int velocidad) {
        velocidadActual += velocidad;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
    }

    @Override
    public void frenar(int velocidad) {
        velocidadActual -= velocidad;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }

    @Override
    public void recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80) {
            velocidadActual = 0;
            System.out.println("No se recomienda salir a navegar.");
        } else if (velocidadViento < 10) {
            System.out.println("La velocidad del viento es muy baja y tampoco se recomienda navegar.");
        } else {
            System.out.println("La velocidad del viento es adecuada para navegar.");
        }
    }

    @Override
    public boolean esSeguroNavegar(int velocidadViento) {
        return velocidadViento >= 10 && velocidadViento <= 80;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
        System.out.println("Vehículo acuático listo");
    }
}