package com.uniajc.ejercicio_abstracto;

import com.uniajc.ejercicio_abstracto.ciclista.Ciclista;
import com.uniajc.ejercicio_abstracto.ciclista.Equipo;
import com.uniajc.ejercicio_abstracto.ciclista.Velocista;
import com.uniajc.ejercicio_abstracto.ciclista.Escalador;
import com.uniajc.ejercicio_abstracto.ciclista.Contrarrelojista;

public class CarreraCiclistas {

    public static void main(String[] args) {

        Equipo equipo = new Equipo("Team Colombia", "Colombia");

        Ciclista v = new Velocista(1, "Juan", 400, 60);
        Ciclista e = new Escalador(2, "Carlos", 15, 30);
        Ciclista c = new Contrarrelojista(3, "Luis", 70);

        equipo.añadirCiclista(v);
        equipo.añadirCiclista(e);
        equipo.añadirCiclista(c);

        equipo.listarNombresCiclistas();

        v.imprimirDatos();
        System.out.println(v.imprimirTipo());

        equipo.calcularTiempoTotal();
        equipo.imprimirDatosEquipo();

        equipo.imprimirDatosCiclistaPorId(2);
    }
}
