package com.uniajc.ejercicio_abstracto;

public class CarreraCiclistas {

    public static void main(String[] args) {

        Equipo equipo = new Equipo("Team Colombia");
        Equipo.setPais("Colombia");

        Velocista v = new Velocista(1, "Juan", 400, 60);
        Escalador e = new Escalador(2, "Carlos", 10, 30);
        Contrarrelojista c = new Contrarrelojista(3, "Luis", 70);

        v.setTiempoAcumulado(120);
        e.setTiempoAcumulado(140);
        c.setTiempoAcumulado(110);

        equipo.añadirCiclista(v);
        equipo.añadirCiclista(e);
        equipo.añadirCiclista(c);

        equipo.imprimirDatosEquipo();

        equipo.listarCiclistas();
    }
}