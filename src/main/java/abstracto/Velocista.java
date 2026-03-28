package abstracto;

public class Velocista extends Ciclista {

    private double potencia;
    private double sprint;

    public Velocista(int codigo, String nombre, double potencia, double sprint) {
        super(codigo, nombre);
        this.potencia = potencia;
        this.sprint = sprint;
    }

    @Override
    public String tipo() {
        return "Velocista";
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Potencia: " + potencia);
        System.out.println("Sprint: " + sprint);
    }
}