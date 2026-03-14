package com.uniajc;

public class CuentaCorriente extends Cuenta {

    protected float sobregiro = 0;

    public CuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa);
    }

    @Override
    public void retirar(float cantidad) {
        numeroRetiros++;
        if(cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            sobregiro += cantidad - saldo;
            saldo = 0;
            System.out.println("Has utilizado un sobregiro de $" +sobregiro);
        }
    }

    @Override
    public void consignar(float cantidad) {
        if(sobregiro > 0) {
            if(cantidad >= sobregiro) {
                cantidad -= sobregiro;
                sobregiro = 0;
                super.consignar(cantidad);
            } else {
                sobregiro -= cantidad;
                System.out.println("Has reducido tu sobregiro a $" +sobregiro);
            }
        } else {
            super.consignar(cantidad);
        }
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();
    }

    @Override
    public void imprimir() {
        System.out.println("\n* * * *   Cuenta Corriente   * * * *");
        System.out.println("Saldo: $" +saldo);
        System.out.println("Comisión mensual: $" +comisionMensual);
        System.out.println("Número de transacciones: " +(numeroConsignaciones + numeroRetiros));
        System.out.println("Sobregiro: $" +sobregiro);
    }
}