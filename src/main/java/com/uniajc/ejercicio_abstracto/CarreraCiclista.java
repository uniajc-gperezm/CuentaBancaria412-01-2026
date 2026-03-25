package com.uniajc.ejercicio_abstracto;

public class CarreraCiclista {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Equipo A", "Colombia");

        Velocista v = new Velocista(2, "Carlos", 1, 1);
        Escalador e = new Escalador(1, "Alberto", 20, 15);
        Contrarrelojista c = new Contrarrelojista(3, "Ana", 60);

        equipo.añadirCiclista(v);
        equipo.añadirCiclista(e);
        equipo.añadirCiclista(c);

        equipo.imprimirDatosEquipo();
        equipo.listarNombresCiclistas();

        System.out.println("\nDatos de un ciclista:");
        equipo.imprimirDatosCiclistaPorId(1);
    }
}