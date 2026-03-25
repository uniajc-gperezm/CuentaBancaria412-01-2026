package com.uniajc.Ejercicio_Ciclista;

public class Main {
    public static void main(String[] args) {

        Equipo team = new Equipo("Colombia Team", "Colombia");

        Velocista v = new Velocista(1, "Gaviria", 1000, 65);
        Escalador e = new Escalador(2, "Nairo", 15, 12);
        Contrarrelojista c = new Contrarrelojista(3, "Rigo", 55);

        team.agregar(v);
        team.agregar(e);
        team.agregar(c);

        team.listar();
        System.out.println("\nBuscando al ID 2:");
        team.buscar(2);
    }
}
