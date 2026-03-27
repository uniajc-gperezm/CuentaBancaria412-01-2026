package abstracto;

public class Main {

    public static void main(String[] args) {

        Equipo equipo = new Equipo("Velocidad Total", "Colombia");

        Ciclista a = new Velocista(101, "Juan Munoz", 410, 62);
        Ciclista b = new Escalador(102, "Pedro Ruiz", 2.8f, 27);
        Ciclista c = new Contrarrelojista(103, "Mario Diaz", 57);

        a.setTiempo(120);
        b.setTiempo(140);
        c.setTiempo(110);

        equipo.agregar(a);
        equipo.agregar(b);
        equipo.agregar(c);

        equipo.mostrarEquipo();

        System.out.println("\nCiclistas:");
        equipo.listar();

        System.out.println("\nBuscar:");
        equipo.buscar(101);

        equipo.totalTiempo();
    }
}