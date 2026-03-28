package com.uniajc.EjercicioabstractoD;

public class Main {

    public static void main(String[] args) {

        Equipo equipo = new Equipo("Team Colombia", "Colombia");

        Velocista v = new Velocista(1, "Juan", 320, 45);
        Escalador e = new Escalador(2, "Carlos", 13.5f, 28);
        Contrarrelojista c = new Contrarrelojista(3, "Luis", 50);

        v.setTiempoAcumulado(120);
        e.setTiempoAcumulado(150);
        c.setTiempoAcumulado(110);

        equipo.añadirCiclista(v);
        equipo.añadirCiclista(e);
        equipo.añadirCiclista(c);

        equipo.calcularTiempoTotal();
        equipo.imprimirEquipo();

        System.out.println("\nLista de ciclistas:");
        equipo.listarCiclistas();

        System.out.println("\nBuscar ciclista ID 2:");
        equipo.buscarCiclista(2);

        System.out.println("\nTipos:");
        System.out.println(v.imprimirTipo());
        System.out.println(e.imprimirTipo());
        System.out.println(c.imprimirTipo());
    }
}