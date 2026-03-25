package com.uniajc.ejercicio_abstracto;

public class CarreraCiclistas {
   public static void main(String[] args) {

        Equipo equipo = new Equipo("Movistar", "España");

        Velocista v = new Velocista(1, "Juan", 400, 60);
        Escalador e = new Escalador(2, "Carlos", 2.5f, 15);
        Contrarrelojista c = new Contrarrelojista(3, "Luis", 70);

        v.setTiempoAcumulado(120);
        e.setTiempoAcumulado(150);
        c.setTiempoAcumulado(110);

        equipo.añadirCiclista(v);
        equipo.añadirCiclista(e);
        equipo.añadirCiclista(c);

        equipo.imprimirDatosEquipo();

        System.out.println("Ciclistas:");
        equipo.listarCiclistas();

        equipo.calcularTiempoTotal();
        System.out.println("Tiempo total equipo: " + Equipo.getTiempoTotalEquipo());

        System.out.println("Buscar ciclista ID 2:");
        equipo.buscarCiclista(2);
    }
}
