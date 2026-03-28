package com.uniajc.ejercicio_abstracto;

import java.util.Scanner;

public class CarreraCiclistas {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Team Uniajc", "Colombia");

        Velocista v1 = new Velocista(1, "Carlos", 120, 400.5, 65.2);
        Escalador e1 = new Escalador(2, "Luis", 130, 2.5f, 12.0f);
        Contrarrelojista c1 = new Contrarrelojista(3, "Ana", 110, 70.0);

        equipo.anadirCiclista(v1);
        equipo.anadirCiclista(e1);
        equipo.anadirCiclista(c1);

        System.out.println("--- DATOS DEL EQUIPO ---");
        equipo.imprimir();

        System.out.println("--- LISTA DE CICLISTAS ---");
        equipo.listarCiclistas();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngrese el identificador de un ciclista para ver sus datos: ");
        int id = sc.nextInt();
        equipo.imprimirCiclistaPorId(id);
        sc.close();
    }
}
