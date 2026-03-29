package ejercicio2_interfaces;

public class Main 
{
    public static void main(String[] args)

    {
    Terrestre camioneta = new Terrestre(60, 130, 4, "militar");

        camioneta.acelerar(40);
        camioneta.frenar(15);
        camioneta.imprimir();

        int revoluciones = camioneta.calcularRevolucionesMotor(20, 7);
        System.out.println("La revoluciones del motor es: " + revoluciones);

        System.out.println(" ");

    
    Acuatico motoAcuatica = new Acuatico(60, 150, "submarino", 10);

        motoAcuatica.acelerar(35);
        motoAcuatica.imprimir();

        motoAcuatica.recomendarVelocidad(95);
    }
}
