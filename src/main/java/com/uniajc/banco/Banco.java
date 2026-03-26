package com.uniajc.banco;

public class Banco {
    public static void main(String[] args) {
        
        CuentaAhorro cuentaAhorro = new CuentaAhorro(15000, 0.05f);
        cuentaAhorro.consignar(5000);
        cuentaAhorro.retirar(2000);
        cuentaAhorro.extractoMensual();
        cuentaAhorro.imprimir();

        System.out.println("---------------------------");

        CuentaCorriente cuentaCorriente = new CuentaCorriente(10000, 0.03f);
        cuentaCorriente.consignar(3000);
        cuentaCorriente.retirar(15000);
        cuentaCorriente.extractoMensual();
        cuentaCorriente.imprimir();
    }
}
