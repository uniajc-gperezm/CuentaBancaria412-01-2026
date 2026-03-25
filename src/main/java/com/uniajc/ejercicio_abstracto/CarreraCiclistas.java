package com.uniajc.ejercicio_abstracto;

public class CarreraCiclistas {
    public static void main(String[] args) {

        Equipo equipo1 = new Equipo("Equipo Alfa", "Colombia", 0);
        Ciclista ciclista1 = new Escalador(1, "Juan Pérez", 3.5f, 12.0f);
        Ciclista ciclista2 = new Contrarrelojista(2, "Carlos Gómez", 45.0);
        Ciclista ciclista3 = new Velocista(3, "Daniel López", 300, 40.0);

        equipo1.añadirCiclista(ciclista1);
        equipo1.añadirCiclista(ciclista2);
        equipo1.añadirCiclista(ciclista3);

        equipo1.calcularTiempoTotalEquipo();

        equipo1.imprimirDatosEquipo();
        equipo1.listarNombresCiclistas();

        equipo1.imprimirDatosCiclistaPorId(1);

       
    }
}
