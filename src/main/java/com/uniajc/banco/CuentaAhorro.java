package com.uniajc.banco;

public class CuentaAhorro extends Cuenta {

    protected boolean activa;

    public CuentaAhorro(float saldo, float tasa) {
        super(saldo, tasa);
        activa = saldo >= 10000;
    }

    @Override
    public void consignar(float cantidad) {
        if(activa) {
            super.consignar(cantidad);
        } else {
            System.out.println("Cuenta inactiva. No se pueden realizar consignaciones.");
        }
    }

    @Override
    public void retirar(float cantidad) {
        if(activa) {
            super.retirar(cantidad);
        } else {
            System.out.println("Cuenta inactiva. No se pueden realizar retiros.");
        }
    }

    public void extractoMensual() {
        if(numeroRetiros > 4) {
            comisionMensual = (numeroRetiros - 4) * 1000;
        }

        super.extractoMensual();
        activa = saldo >= 10000;
    }

    public void imprimir() {
        System.out.println("\n* * * *   Cuenta de Ahorros   * * * *");
        System.out.println("Saldo: $" +saldo);
        System.out.println("Comision mensual: $" +comisionMensual);
        System.out.println("Número de transacciones: " +(numeroConsignaciones + numeroRetiros));
        System.out.println("Cuenta activa: " +(activa ? "Sí" : "No"));
    }
}