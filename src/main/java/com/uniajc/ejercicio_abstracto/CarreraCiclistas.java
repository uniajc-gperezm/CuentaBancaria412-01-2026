package com.uniajc.ejercicio_abstracto;

public class CarreraCiclistas {
    public static void main(String[] args) {

        Equipo equipo1 = new Equipo("Equipo A", "Colombia");
        Equipo equipo2 = new Equipo("Equipo B", "España");

        Ciclista ciclista1 = new Escalador(1, "Ciclista 1", 120, 3.5f, 8.0f);
        Ciclista ciclista2 = new Velocista(2, "Ciclista 2", 110, 400.0, 60.0);
        Ciclista ciclista3 = new Escalador(3, "Ciclista 3", 130, 3.0f, 10.0f);
        Ciclista ciclista4 = new Velocista(4, "Ciclista 4", 115, 450.0, 65.0);

        equipo1.agregarCiclista(ciclista1);
        equipo1.agregarCiclista(ciclista2);
        equipo2.agregarCiclista(ciclista3);
        equipo2.agregarCiclista(ciclista4);

        System.out.println("Información del Equipo 1:");
        equipo1.imprimirEquipo();

        System.out.println("\nInformación del Equipo 2:");
        equipo2.imprimirEquipo();
       
    
    System.out.println("List<a de ciclistas:");
    equipo1.listarNombresCiclistas();
     
    System.out.println("ingrese el identificador del ciclista a buscar:");
    equipo1.buscarCiclistaPorIdentificador();
    



        
    }

}
