package com.uniajc.ejercicio_abstracto;

public class CarreraCiclistas {

    public static void main(String[] args) {

        // 🔹 Equipo 1
        Equipo equipo1 = new Equipo("Los Relampagos verdes");

        Velocista v1 = new Velocista(1, "Juan", 400, 60);
        Escalador e1 = new Escalador(2, "Pedro", 2.5f, 15);
        Contrarelojista c1 = new Contrarelojista(3, "Luis", 50);

        v1.setTiempoAcumulado(120);
        e1.setTiempoAcumulado(110);
        c1.setTiempoAcumulado(130);

        equipo1.añadirCiclista(v1);
        equipo1.añadirCiclista(e1);
        equipo1.añadirCiclista(c1);

        equipo1.calcularTotalTiempo();

        // 🔹 Equipo 2
        Equipo equipo2 = new Equipo("Demonios colorados");

        Velocista v2 = new Velocista(4, "Carlos", 420, 62);
        Escalador e2 = new Escalador(5, "Andres", 2.8f, 18);
        Contrarelojista c2 = new Contrarelojista(6, "Miguel", 55);

        v2.setTiempoAcumulado(115);
        e2.setTiempoAcumulado(125);
        c2.setTiempoAcumulado(120);

        equipo2.añadirCiclista(v2);
        equipo2.añadirCiclista(e2);
        equipo2.añadirCiclista(c2);

        equipo2.calcularTotalTiempo();

        //Mostrar equipos
        System.out.println("===== LOS RELAMPAGOS VERDES =====");
        equipo1.imprimirEquipo();

        System.out.println("\n===== DEMONIOS COLORADOS =====");
        equipo2.imprimirEquipo();

        // Comparación
        System.out.println("\n===== RESULTADO FINAL =====");

        if (equipo1.getTotalTiempo() < equipo2.getTotalTiempo()) {
            System.out.println("Gana Los Relampagos verdes");
        } else if (equipo2.getTotalTiempo() < equipo1.getTotalTiempo()) {
            System.out.println("Gana Demonios colorados");
        } else {
            System.out.println("Empate");
        }
    }
}