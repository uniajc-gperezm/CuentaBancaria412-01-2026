package com.uniajc.polimorfismo2;

public class MainCiclista {

    public static void main(String[] args) {

        Ciclista v = new Velocista(1, "Juan", 120, 300, 45);
        Ciclista e = new Escalador(2, "Pedro", 150, 20, 10);
        Ciclista c = new Contrarrelojista(3, "Luis", 110, 60);

        v.imprimir();
        System.out.println("-------------");
        e.imprimir();
        System.out.println("-------------");
        c.imprimir();
    }
}
