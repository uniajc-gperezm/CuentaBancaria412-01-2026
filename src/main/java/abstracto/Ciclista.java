package abstracto;

public abstract class Ciclista {

    protected int codigo;
    protected String nombre;
    protected int tiempo;

    public Ciclista(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tiempo = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public abstract String tipo();

    public void mostrar() {
        System.out.println("Tipo: " + tipo());
    }
}