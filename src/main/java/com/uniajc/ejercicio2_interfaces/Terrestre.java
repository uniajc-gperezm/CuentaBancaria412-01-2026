package com.uniajc.ejercicio2_interfaces;
import com.uniajc.ejercicio2_interfaces.interfaces.IMotor;

public class Terrestre extends Vehiculo implements IMotor {
    
    private int cantidadLlantas;
    private String uso;

    public Terrestre(int velocidadActual, int velocidadMaxima, int cantidadLlantas, String uso) {
        super(velocidadActual, velocidadMaxima);
        this.cantidadLlantas = cantidadLlantas;
        this.uso = uso;
    }

    public int getCantidadLlantas() {
        return cantidadLlantas;
    }

    public void setCantidadLlantas(int cantidadLlantas) {
        this.cantidadLlantas = cantidadLlantas;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
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
    public void imprimir() {
        super.imprimir();
        System.out.println("Cantidad de llantas: " +cantidadLlantas);
        System.out.println("Uso: " +uso);
    }
}