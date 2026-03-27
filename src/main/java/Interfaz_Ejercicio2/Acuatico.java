package Interfaz_Ejercicio2;
import Interfaz_Ejercicio2.Interfaces.*;
public class Acuatico extends Vehiculo implements Motor, Vela {
    private String tipo;
    private int capacidadPasajeros;

    public Acuatico(int velocidadMaxima, int velocidadActual, String tipo, int capacidadPasajeros) {
        super(velocidadMaxima, velocidadActual);
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
        if (velocidadActual + velocidad > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
            System.out.println("¡Has alcanzado la velocidad máxima!"+velocidadActual+" km/h");
        } else {
            velocidadActual = velocidadMaxima;
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
    public void recomendarVelocidad(int vViento) {
        if (vViento >80) {
        velocidadActual = 0;
        System.out.println("¡El viento es demasiado fuerte para navegar!"+velocidadActual+" km/h");
        } else if (vViento < 10) {
            System.out.println("¡El viento es demasiado débil para navegar!"+velocidadActual+" km/h" );}
            else {
                System.out.println("¡La velocidad recomendada para navegar es: "+velocidadActual+" km/h");
            }
    
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
    }
}
