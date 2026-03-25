package com.uniajc.ejercicio_abstracto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarreraCiclistas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // CREACIÓN DE EQUIPOS
        Equipo teamColombia = new Equipo("Team Colombia", "Colombia");
        Equipo teamIneos = new Equipo("Team Ineos", "Reino Unido");
        Equipo teamJumbo = new Equipo("Team Jumbo-Visma", "Países Bajos");

        // INFORMACIÓN DEL TEAM COLOMBIA
        Velocista fernandoGaviria = new Velocista(1, "Fernando Gaviria", 1200.5, 78.3);
        fernandoGaviria.setTiempoAcumulado(320);

        Escalador nairoQuintana = new Escalador(2, "Nairo Quintana", 4.5f, 12.3f);
        nairoQuintana.setTiempoAcumulado(340);

        Contrarrelojista rigoberto = new Contrarrelojista(3, "Rigoberto Urán", 95.7);
        rigoberto.setTiempoAcumulado(310);

        Escalador eganBernal = new Escalador(4, "Egan Bernal", 4.8f, 13.5f);
        eganBernal.setTiempoAcumulado(298);

        teamColombia.añadirCiclista(fernandoGaviria);
        teamColombia.añadirCiclista(nairoQuintana);
        teamColombia.añadirCiclista(rigoberto);
        teamColombia.añadirCiclista(eganBernal);

        // INFORMACIÓN DEL TEAM INEOS
        Velocista geraintThomas = new Velocista(5, "Geraint Thomas", 1100.0, 72.5);
        geraintThomas.setTiempoAcumulado(315);

        Escalador taoGeoghegan = new Escalador(6, "Tao Geoghegan", 4.2f, 11.8f);
        taoGeoghegan.setTiempoAcumulado(325);

        Contrarrelojista chrisFroome = new Contrarrelojista(7, "Chris Froome", 98.2);
        chrisFroome.setTiempoAcumulado(308);

        Velocista micahElliott = new Velocista(8, "Micah Elliott", 1050.0, 70.1);
        micahElliott.setTiempoAcumulado(330);

        teamIneos.añadirCiclista(geraintThomas);
        teamIneos.añadirCiclista(taoGeoghegan);
        teamIneos.añadirCiclista(chrisFroome);
        teamIneos.añadirCiclista(micahElliott);

        // INFORMACIÓN DEL TEAM JUMBO
        Contrarrelojista primozRoglic = new Contrarrelojista(9, "Primoz Roglic", 102.4);
        primozRoglic.setTiempoAcumulado(295);

        Escalador jonasVingegaard = new Escalador(10, "Jonas Vingegaard", 5.1f, 14.2f);
        jonasVingegaard.setTiempoAcumulado(290);

        Velocista dylanGroenewegen = new Velocista(11, "Dylan Groenewegen", 1250.0, 80.5);
        dylanGroenewegen.setTiempoAcumulado(322);

        Contrarrelojista stevenKruijswijk = new Contrarrelojista(12, "Steven Kruijswijk", 93.6);
        stevenKruijswijk.setTiempoAcumulado(318);

        teamJumbo.añadirCiclista(primozRoglic);
        teamJumbo.añadirCiclista(jonasVingegaard);
        teamJumbo.añadirCiclista(dylanGroenewegen);
        teamJumbo.añadirCiclista(stevenKruijswijk);

        // LISTA DE EQUIPOS
        List<Equipo> equipos = new ArrayList<>();
        equipos.add(teamColombia);
        equipos.add(teamIneos);
        equipos.add(teamJumbo);

        // DATOS DE TODOS LOS EQUIPOS
        System.out.println("\n===== Datos de todos los equipos =====");
        for(Equipo e : equipos) {
            e.imprimirDatosEquipo();
            e.listarNombresCiclistas();
        }

        // RANKING DE EQUIPOS
        System.out.println("\n===== Ranking de equipos =====");
        for(Equipo e : equipos) {
            e.calcularTiempoTotal();
        }

        equipos.sort((a, b) -> a.getTiempoTotalEquipo() - b.getTiempoTotalEquipo());

        for(int i = 0; i < equipos.size(); i++) {
            System.out.println((i+1)+ ". " +equipos.get(i).getNombreEquipo()+ " | Tiempo total: " +equipos.get(i).getTiempoTotalEquipo()+ " min");
        }

        // EQUIPO LÍDER
        System.out.println("\n===== Equipo líder de la carrera =====");
        System.out.println("Líder: " +equipos.get(0).getNombreEquipo()+ " con " +equipos.get(0).getTiempoTotalEquipo()+ " min");

        // CICLISTA MÁS RÁPIDO POR EQUIPO
        System.out.println("\n===== Ciclista más rápido por equipo =====");
        for(Equipo e : equipos) {
            e.imprimirCiclistaMasRapido();
        }

        // BUSCAR CICLISTA POR ID EN TODOS LOS EQUIPOS
        System.out.println("\n===== Buscar ciclista por ID =====");
        System.out.print("Ingrese el identificador del ciclista: ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean encontrado = false;
        for(Equipo e : equipos) {
            if(e.imprimirDatosCiclistaPorId(id)) {
                System.out.println("Pertenece al equipo: " +e.getNombreEquipo());
                encontrado = true;
                break;
            }
        }
        
        if(!encontrado) {
            System.out.println("No existe ningún ciclista con el ID " +id);
        }

        // CONTEO POR ESPECIALIDAD
        System.out.println("\n===== Conteo por especialidad =====");
        int velocistas = 0, escaladores = 0, contrarrelojistas = 0;
        for(Equipo e : equipos) {
            for(Ciclista c : e.getCiclistas()) {
                if(c instanceof Velocista) {
                    velocistas++;
                } else if(c instanceof Escalador) {
                    escaladores++;
                } else if(c instanceof Contrarrelojista) {
                    contrarrelojistas++;
                }
            }
        }

        System.out.println("Velocistas: " +velocistas);
        System.out.println("Escaladores: " +escaladores);
        System.out.println("Contrarrelojistas: " +contrarrelojistas);

        sc.close();
    }
}