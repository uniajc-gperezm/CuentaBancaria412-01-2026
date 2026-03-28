package com.uniajc.ejercicio2_vehiculos;

public class Terrestre extends Vehiculo implements Motor {
    private int cantidadLlantas;
    private String usoVehiculo;

    public Terrestre(int velocidadActual, int velocidadMaxima, int cantidadLlantas, String usoVehiculo) {
        super(velocidadActual, velocidadMaxima);
        this.cantidadLlantas = cantidadLlantas;
        this.usoVehiculo = usoVehiculo;
    }

    public boolean esVehiculoPesado() {
        return cantidadLlantas > 4;
    }

    public void setCantidadLlantas(int cantidadLlantas) {
        this.cantidadLlantas = cantidadLlantas;
    }

    public String getUsoVehiculo() {
        return usoVehiculo;
    }

    public void setUsoVehiculo(String usoVehiculo) {
        this.usoVehiculo = usoVehiculo;
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
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }

    @Override
    public int obtenerTipoMotor() {
        return 1;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cantidad de llantas: " + cantidadLlantas);
        System.out.println("Uso del vehículo: " + usoVehiculo);
        System.out.println("Vehículo terrestre listo");
    }
}