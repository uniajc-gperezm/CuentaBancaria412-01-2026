package com.uniajc.ejercicio_abstracto;

import java.util.Scanner;

public class CarreraCiclistas {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Equipo Colombia", "Colombia");

        // Crear ciclistas
        Velocista v1 = new Velocista(1, "Juan Veloz", 400.0, 60.5);
        v1.setTiempoAcumulado(120);
        Escalador e1 = new Escalador(2, "Pedro Escalador", 2.5f, 15.0f);
        e1.setTiempoAcumulado(150);
        Contrarrelojista c1 = new Contrarrelojista(3, "Ana Crono", 55.0);
        c1.setTiempoAcumulado(100);

        // Añadir ciclistas al equipo
        equipo.añadirCiclista(v1);
        equipo.añadirCiclista(e1);
        equipo.añadirCiclista(c1);

        // Calcular total tiempos
        equipo.calcularTotalTiempos();

        // Imprimir datos del equipo
        equipo.imprimirDatos();

        // Listar nombres
        equipo.listarNombres();

        // Buscar ciclista por ID
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del ciclista a buscar: ");
        int id = scanner.nextInt();
        equipo.buscarCiclistaPorId(id);
        scanner.close();
    }
}
