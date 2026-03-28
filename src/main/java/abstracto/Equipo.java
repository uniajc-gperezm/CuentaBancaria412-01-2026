package abstracto;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private String pais;
    private ArrayList<Ciclista> lista;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.lista = new ArrayList<>();
    }

    public void agregar(Ciclista c) {
        lista.add(c);
    }

    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombre + " - " + pais);
    }

    public void listar() {
        for (Ciclista c : lista) {
            System.out.println(c.getNombre());
        }
    }

    public void buscar(int codigo) {
        for (Ciclista c : lista) {
            if (c.getCodigo() == codigo) {
                System.out.println("Encontrado:");
                System.out.println(c.getNombre());
                c.mostrar();
                return;
            }
        }
        System.out.println("No encontrado");
    }

    public void totalTiempo() {
        int total = 0;
        for (Ciclista c : lista) {
            total += c.getTiempo();
        }
        System.out.println("Tiempo total: " + total);
    }
}