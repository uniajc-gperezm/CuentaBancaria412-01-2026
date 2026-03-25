package com.uniajc.ejercicio_abstracto;
import java.util.Scanner;

public class CarreraCiclistas {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        // Creación del equipo
        Equipo equipo = new Equipo("Team Colombia", "Colombia");

        // Crear ciclistas de diferentes tipos
        Velocista v1 = new Velocista(1, "Fernando Gaviria", 1200.5, 78.3);
        v1.setTiempoAcumulado(320);

        Escalador e1 = new Escalador(2, "Nairo Quintana", 4.5f, 12.3f);
        e1.setTiempoAcumulado(340);

        Contrarrelojista c1 = new Contrarrelojista(3, "Rigoberto Urán", 95.7);
        c1.setTiempoAcumulado(310);

        Velocista v2 = new Velocista(4, "Álvaro Hodeg", 1150.0, 75.8);
        v2.setTiempoAcumulado(330);

        // Añadir ciclistas al equipo
        equipo.añadirCiclista(v1);
        equipo.añadirCiclista(e1);
        equipo.añadirCiclista(c1);
        equipo.añadirCiclista(v2);

        // Impresión de datos del equipo y ciclistas
        equipo.imprimirDatosEquipo();

        // Listar nombres de ciclistas
        equipo.listarNombresCiclistas();

        // Buscar ciclista por ID
        System.out.println("\n===== Buscar ciclista por ID =====");
        System.out.print("Ingrese el identificador del ciclista: ");
        int id = sc.nextInt();
        equipo.imprimirDatosCiclistaPorId(id);

        sc.close();
    }
}