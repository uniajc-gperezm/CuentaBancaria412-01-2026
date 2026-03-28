package abstracto;

public class Escalador extends Ciclista {

    private float aceleracion;
    private float pendiente;

    public Escalador(int codigo, String nombre, float aceleracion, float pendiente) {
        super(codigo, nombre);
        this.aceleracion = aceleracion;
        this.pendiente = pendiente;
    }

    @Override
    public String tipo() {
        return "Escalador";
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Aceleracion: " + aceleracion);
        System.out.println("Pendiente: " + pendiente);
    }
}