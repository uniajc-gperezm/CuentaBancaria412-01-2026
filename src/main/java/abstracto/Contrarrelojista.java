package abstracto;

public class Contrarrelojista extends Ciclista {

    private double velocidad;

    public Contrarrelojista(int codigo, String nombre, double velocidad) {
        super(codigo, nombre);
        this.velocidad = velocidad;
    }

    @Override
    public String tipo() {
        return "Contrarrelojista";
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Velocidad: " + velocidad);
    }
}