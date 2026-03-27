package Interfaz_Ejercicio2;
import Interfaz_Ejercicio2.Interfaces.Motor;
public class Terrestre extends Vehiculo implements Motor {
   
    private int numeroRuedas;
   private String uso;

public Terrestre (int velocidadMaxima, int velocidadActual, int numeroRuedas, String uso) {
        super(velocidadMaxima, velocidadActual);
        this.numeroRuedas = numeroRuedas;
        this.uso = uso;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    @Override
    public void acelerar(int velocidad) {
        if (velocidadActual + velocidad > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
            System.out.println("¡Has alcanzado la velocidad máxima!"+velocidadActual+" km/h");
        } else {
            velocidadActual += velocidad;
            System.out.println("Se esta acelerando a "+velocidadActual+" km/h");
        }
    }

    @Override
    public void frenar(int velocidad) {
        if (velocidadActual - velocidad < 0) {
            velocidadActual = 0;
            System.out.println("¡Has detenido el vehículo!"+velocidadActual+" km/h");
        } else {
            velocidadActual -= velocidad;
            System.out.println("Se esta frenando a "+velocidadActual+" km/h");
        }
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return (fuerza * radio) ;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de ruedas: " + numeroRuedas);
        System.out.println("Uso: " + uso);
    }
    
}

