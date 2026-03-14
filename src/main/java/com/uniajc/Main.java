package com.uniajc;

public class Main {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(1000, 0.1025f);
        cuenta1.consignar(500);
        cuenta1.retirar(200);
        cuenta1.extracto_mensual();
        cuenta1.imprimir();

        CuentaAhorro cuenta2 = new CuentaAhorro(15000, 0.105f);
        cuenta2.ejecutarOperacion();
        cuenta2.imprimir2();

        CuentaCorriente cuenta3 = new CuentaCorriente(2000, 0.1f);
        cuenta3.retirar(1000);
        cuenta3.consignar(500);
        cuenta3.extracto_mensual();
        cuenta3.imprimir3();

    }

}
