package com.uniajc.Ejercicio_Ciclista;

public class Main {
    public static void main(String[] args) {

        Equipo team1 = new Equipo("Movistar", "España");
        Velocista v1 = new Velocista(1, "Nairo", 0, 0); 
        v1.setTiempo(100);
        team1.agregar(v1);

        Equipo team2 = new Equipo("Ineos", "Reino Unido");
        Velocista v2 = new Velocista(2, "Egan", 0, 0);
        v2.setTiempo(95); 
        team2.agregar(v2);

        team1.listar();
        System.out.println();
        team2.listar();
        System.out.println("---------------------------");

        int tiempo1 = team1.calcularTiempoTotal();
        int tiempo2 = team2.calcularTiempoTotal();

        if (tiempo1 < tiempo2) {
            System.out.println("El ganador es: " + team1.getNombre());
        } else if (tiempo2 < tiempo1) {
            System.out.println("El ganador es: " + team2.getNombre());
        } else {
            System.out.println("¡Es un empate!");
        }
    }
}
