package com.uniajc.abstracto;

public class Main {

    public static void main(String[] args) {

      Equipo equipo = new Equipo("Team Colombia", "Colombia");

Velocista v = new Velocista(1, "Juan", 400, 60);
Escalador e = new Escalador(2, "Carlos", 2.5f, 30);
Contrarrelojista c = new Contrarrelojista(3, "Luis", 55);

        v.setTiempoAcumulado(120);
        e.setTiempoAcumulado(150);
        c.setTiempoAcumulado(110);

        equipo.agregarCiclista(v);
        equipo.agregarCiclista(e);
        equipo.agregarCiclista(c);

        equipo.mostrarEquipo();

        System.out.println("\nCiclistas:");
        equipo.listarCiclistas();

        System.out.println("\nBuscar ciclista:");
        equipo.buscarCiclista(2);

        equipo.calcularTiempoTotal();
    }
}