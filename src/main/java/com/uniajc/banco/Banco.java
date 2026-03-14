package com.uniajc.banco;

public class Banco {

    public static void main(String[] args) {
        CuentaAhorro ca = new CuentaAhorro(50000, 0.12f);

        ca.consignar(20000);
        ca.consignar(10000);
        ca.retirar(15000);
        ca.retirar(23000);
        ca.retirar(22000);
        ca.retirar(7000);
        ca.retirar(1000);
        ca.extractoMensual();
        ca.imprimir();
    }
}
