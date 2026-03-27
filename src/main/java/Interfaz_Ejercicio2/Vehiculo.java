package Interfaz_Ejercicio2;

public abstract class Vehiculo {
    protected int velocidadMaxima;
    protected int velocidadActual;

    public Vehiculo(int velocidadMaxima, int velocidadActual) {
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
    }

    public void imprimir() {
        System.out.println("Velocidad máxima: " + velocidadMaxima);
        System.out.println("Velocidad actual: " + velocidadActual);
    }
    
    public abstract void acelerar(int velocidad);
    public abstract void frenar(int velocidad);

}