package com.uniajc.ejercicio_abstracto;

public class CarreraCiclistas {
    public static void main(String[] args) {

        // se crean los equipos 
        
        Equipo equipo = new Equipo("Rayo Azul", "Colombia");
        Equipo equipo2 = new Equipo("Purple ", "España");
        Equipo equipo3 = new Equipo("Amercica ", "Colombia");
        Equipo equipo4 = new Equipo("cali", "Colombia");

        Velocista v1 = new Velocista(1, "Camila", 410.5, 65.2);
        v1.setTiempoAcumulado(120);

        Escalador e1 = new Escalador(2, "Mateo", 3.8f, 12.5f);
        e1.setTiempoAcumulado(135);

        Contrarrelojista c1 = new Contrarrelojista(3, "Sofia", 72.0);
        c1.setTiempoAcumulado(128);
        
          
          



        equipo.anadirCiclista(v1);
        equipo.anadirCiclista(e1);
        equipo.anadirCiclista(c1);

        System.out.println("=== Datos del equipo ===");
        equipo.imprimirDatosEquipo();
        System.out.println();

        System.out.println("=== Lista de ciclistas ===");
        equipo.listarNombresCiclistas();
        System.out.println();

        System.out.println("=== Datos de un ciclista por ID ===");
        equipo.imprimirDatosCiclistaPorId(2);
    }
}
