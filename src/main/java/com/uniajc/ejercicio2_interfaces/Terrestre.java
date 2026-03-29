package com.uniajc.ejercicio2_interfaces;
import com.uniajc.ejercicio2_interfaces.Interfaces.Motor;

public class Terrestre extends Vehiculo implements Motor 
{
    private int cantidadLlantas;
    private String usoVehiculo;

    public Terrestre(int velocidadActual, int velocidadMaxima, int cantidadLlantas, String usoVehiculo) 
    {
        super(velocidadActual, velocidadMaxima);
        this.cantidadLlantas = cantidadLlantas;
        this.usoVehiculo = usoVehiculo;
    }
     
    @Override
    public void acelerar(int velocidad)
    {
        if (velocidadActual + velocidad > velocidadMaxima) 
        {
          velocidadActual = velocidadMaxima;
          System.out.println("Alcanzaste la velocidad máxima" +velocidadActual +" km/h");
        }

        else
        {
            velocidadActual += velocidad;
            System.out.println("Se acelera a" +velocidadActual +" km/h");
        }
    }

    @Override
    public void frenar(int velocidad) 
    {
        if (velocidadActual - velocidad < 0)
        { 
            velocidadActual = 0;
            System.out.println("Se detuvo el vehiculo" +velocidadActual+" km/h");
        }

        else
        {
            velocidadActual -= velocidad;
            System.out.println("Se frena a "+velocidadActual+" km/h");
        }
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) 
    {
        return fuerza * radio;
    }

    @Override
    public void imprimir() 
    {
        super.imprimir();
        System.out.println("La cantidad de llantas es: " + cantidadLlantas);
        System.out.println(" El uso del vehiculo es: " + usoVehiculo);
    }
}
