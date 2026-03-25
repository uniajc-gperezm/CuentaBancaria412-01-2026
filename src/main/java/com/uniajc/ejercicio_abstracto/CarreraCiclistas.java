package com.uniajc.ejercicio_abstracto;

public class CarreraCiclistas {
    public static void main(String[] args) {

        // se crean los equipos  y se llenan los datos 

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

        Velocista v2 = new Velocista(4, "Juan", 395.0, 63.8);
        v2.setTiempoAcumulado(140);

        Escalador e2 = new Escalador(5, "Laura", 3.6f, 11.2f);
        e2.setTiempoAcumulado(142);

        Contrarrelojista c2 = new Contrarrelojista(6, "Andres", 70.5);
        c2.setTiempoAcumulado(133);

        Velocista v3 = new Velocista(7, "Paula", 420.0, 66.1);
        v3.setTiempoAcumulado(125);

        Escalador e3 = new Escalador(8, "Diego", 3.9f, 12.9f);
        e3.setTiempoAcumulado(138);

        Contrarrelojista c3 = new Contrarrelojista(9, "Valentina", 73.2);
        c3.setTiempoAcumulado(130);
        
          
 // lista de equipos 


        equipo.anadirCiclista(v1);
        equipo.anadirCiclista(e1);
        equipo.anadirCiclista(c1);

        equipo2.anadirCiclista(v2);
        equipo2.anadirCiclista(e2);
        equipo2.anadirCiclista(c2);

        equipo3.anadirCiclista(v3);
        equipo3.anadirCiclista(e3);
        equipo3.anadirCiclista(c3);

        equipo4.anadirCiclista(new Velocista(10, "Mateo", 405.0, 64.4));
        equipo4.anadirCiclista(new Escalador(11, "Sara", 3.7f, 10.8f));
        equipo4.anadirCiclista(new Contrarrelojista(12, "Julian", 71.6));

        System.out.println("=== Datos del equipo ===");
        equipo.imprimirDatosEquipo();
        System.out.println();

        System.out.println("=== Lista de ciclistas ===");
        equipo.listarNombresCiclistas();
        System.out.println();

        System.out.println("=== Datos de un ciclista por ID ===");
        equipo.imprimirDatosCiclistaPorId(2);

//  Funcionalidades adicionales 

 System.out.println("\n=== TODOS LOS EQUIPOS ===");

 equipo.imprimirDatosEquipo();
        equipo2.imprimirDatosEquipo();
        equipo3.imprimirDatosEquipo();
        equipo4.imprimirDatosEquipo();


        System.out.println("\n=== BUSCAR EQUIPO POR NOMBRE ===");
       String nombreBuscado = "ingrese el nombre del equipo";

        if (equipo.getNombreEquipo().equalsIgnoreCase(nombreBuscado)) {
            equipo.imprimirDatosEquipo();
        } else if (equipo2.getNombreEquipo().equalsIgnoreCase(nombreBuscado)) {
            equipo2.imprimirDatosEquipo();
        } else if (equipo3.getNombreEquipo().equalsIgnoreCase(nombreBuscado)) {
            equipo3.imprimirDatosEquipo();
        } else if (equipo4.getNombreEquipo().equalsIgnoreCase(nombreBuscado)) {
            equipo4.imprimirDatosEquipo();
        } else {
            System.out.println("Equipo no encontrado");
        }

    }
}
