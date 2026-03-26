package com.uniajc.ejercicio_abstracto; // Clase principal del ejercicio ciclistas

public class CarreraCiclistas {
    public static void main(String[] args) {

         Equipo equipo = new Equipo("Relampagos", "Colombia");

        Velocista v = new Velocista(1, "Juan", 400, 60);
        Escalador e = new Escalador(2, "Carlos", 2.5f, 30);
        Contrarrelojista c = new Contrarrelojista(3, "Luis", 70);

        v.setTiempoAcumulado(120);
        e.setTiempoAcumulado(150);
        c.setTiempoAcumulado(100);

        equipo.añadirCiclista(v);
        equipo.añadirCiclista(e);
        equipo.añadirCiclista(c);

        equipo.calcularTiempoTotal();
        equipo.imprimirDatosEquipo();
        equipo.listarCiclistas();

        equipo.buscarCiclista(2);
       
    }
}
