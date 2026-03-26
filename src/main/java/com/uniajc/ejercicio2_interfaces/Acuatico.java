package com.uniajc.ejercicio2_interfaces;
import com.uniajc.ejercicio2_interfaces.interfaces.*;

public class Acuatico extends Vehiculo implements IMotor, IVela {
    
    private String tipo;
    private int capacidadPasajeros;

    public Acuatico(int velocidadActual, int velocidadMaxima, String tipo, int capacidadPasajeros) {
        super(velocidadActual, velocidadMaxima);
        this.tipo = tipo;
        this.capacidadPasajeros = capacidadPasajeros;
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
        if(velocidadActual + velocidad > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
            System.out.println("Velocidad máxima alcanzada: " +velocidadMaxima+ " km/h");
        } else {
            velocidadActual += velocidad;
            System.out.println("Acelerando... Velocidad actual: " +velocidadActual+ " km/h");
        }
    }

    @Override
    public void frenar(int velocidad) {
        if(velocidadActual - velocidad < 0) {
            velocidadActual = 0;
            System.out.println("El vehículo se ha detenido.");
        } else {
            velocidadActual -= velocidad;
            System.out.println("Frenando... Velocidad actual: " +velocidadActual+ " km/h");
        }
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }

    @Override
    public void recomendarVelocidad(int velocidadViento) {
        if(velocidadViento > 80) {
            velocidadActual = 0;
            System.out.println("Velocidad del viento muy alta. No se recomienda salir a navegar.");
            System.out.println("Velocidad actual ajustada a: " +velocidadActual+ " km/h");
        } else if(velocidadViento < 10) {
            System.out.println("Velocidad del viento muy baja. Tampoco se recomienda salir a navegar.");
        } else {
            System.out.println("Velocidad del viento adecuada. Puede salir a navegar.");
        }
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: " +tipo);
        System.out.println("Capacidad de pasajeros: " +capacidadPasajeros);
    }
}