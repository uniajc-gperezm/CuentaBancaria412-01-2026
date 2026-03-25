package com.uniajc.ejercicio_abstracto;

public class CarreraCiclistas {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Los Relampagos Verdes", "Colombia");

        Velocista velocista = new Velocista(1, "David", 320.5, 45.8);
        Escalador escalador = new Escalador(2, "Juan", 12.5f, 30.2f);
        Contrarrelojista contrarrelojista = new Contrarrelojista(3, "Pedro", 50.7);

        velocista.setTiempoAcumulado(120);
        escalador.setTiempoAcumulado(150);
        contrarrelojista.setTiempoAcumulado(110);

        equipo1.anadirCiclista(velocista);
        equipo1.anadirCiclista(escalador);
        equipo1.anadirCiclista(contrarrelojista);

        equipo1.calcularTiempoTotal();

        equipo1.imprimirDatosEquipo();
        System.out.println();

        equipo1.listarNombresCiclistas();
        System.out.println();

        equipo1.imprimirDatosCiclistaPorId(2);
    }
}