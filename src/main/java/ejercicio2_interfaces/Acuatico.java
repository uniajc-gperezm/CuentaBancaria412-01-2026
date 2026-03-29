package ejercicio2_interfaces;
import ejercicio2_interfaces.Interfaces.Vela;

 public class Acuatico extends Vehiculo implements Vela 
 {
    private String tipo;
    private int capacidadPasajeros;

    public Acuatico(int velocidadActual, int velocidadMaxima, String tipo, int capacidadPasajeros) 
    {
        super(velocidadActual, velocidadMaxima);
        this.tipo = tipo;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public void acelerar(int velocidad) 
    {
        if (velocidadActual + velocidad > velocidadMaxima) 
        {
          velocidadActual = velocidadMaxima;
          System.out.println("Alcanzastela velocidad máxima" +velocidadActual +" km/h");
        } 
        
        else 
        {
          velocidadActual += velocidad;
          System.out.println("Se acelera a " +velocidadActual +" km/h");
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
    public void  recomendarVelocidad(int velocidadViento)
    {
        if (velocidadViento > 80)
        {
           velocidadActual = 0;
           System.out.println("La velocidad del viento está alta, no se recomienda navegar"+velocidadActual+" km/h");
        } 
        
        else if (velocidadViento < 10) 
        {
           System.out.println(" La velocidad del viento está muy baja, no se recomienda navegar"+velocidadActual+" km/h" );
        } 
        
        else 
        { 
            System.out.println(" la velocidad del viento adecuada para navegar es " + velocidadActual + " km/h");
        }
    }

    @Override
    public void imprimir() 
    {
        super.imprimir();
        System.out.println("El tipo de vehiculo es: "+ tipo);
        System.out.println("La capacidad de personas es: "+ capacidadPasajeros);
    }
}
