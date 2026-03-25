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
        
          
 // lista de equipos 


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
