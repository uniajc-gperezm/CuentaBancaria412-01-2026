package Interfaz_Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Terrestre camioneta = new Terrestre(50, 180, 4, "Civil");
        Acuatico motoAcuatico = new Acuatico(50, 110, "Superficie", 2);
        System.out.println("Camioneta:");
        camioneta.imprimir();
        System.out.println("Acelerando camioneta a 20 km/h...");
        camioneta.acelerar(20);
        int revoluciones = camioneta.calcularRevolucionesMotor(3, 5);
        System.out.println("Revoluciones del motor: " + revoluciones);
        System.out.println("Revoluciones del motor: " +revoluciones);
        System.out.println("\n-- Frenando --");
        camioneta.frenar(30);
        int revolucionesFrenando = camioneta.calcularRevolucionesMotor(4, 2);
        System.out.println("Revoluciones del motor: " +revolucionesFrenando);

        System.out.println("Moto Acuática:");
        motoAcuatico.imprimir();
        System.out.println("\n-- Revisando condiciones del viento antes de salir --");
        int viento1 = 85;
        System.out.println("Viento: " +viento1+ " km/h");
        motoAcuatico.recomendarVelocidad(viento1);

        int viento2 = 5;
        System.out.println("\nViento: " +viento2+ " km/h");
        motoAcuatico.recomendarVelocidad(viento2);

        int viento3 = 40;
        System.out.println("\nViento: " +viento3+ " km/h");
        motoAcuatico.recomendarVelocidad(viento3);

        System.out.println("\n-- Condiciones aptas, acelerando --");
        motoAcuatico.acelerar(30);
        int revolucionesMotoAcelerando = motoAcuatico.calcularRevolucionesMotor(3,2);
        System.out.println("Revoluciones del motor: " +revolucionesMotoAcelerando);

        System.out.println("\n-- Frenando --");
        motoAcuatico.frenar(10);
        int revolucionesMotoFrenando = motoAcuatico.calcularRevolucionesMotor(2, 2);
        System.out.println("Revoluciones del motor: " +revolucionesMotoFrenando);
 
    }
}
