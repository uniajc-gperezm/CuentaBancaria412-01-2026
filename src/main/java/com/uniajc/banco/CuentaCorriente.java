package com.uniajc.banco;

public class CuentaCorriente extends Cuenta {

    private float sobregiro;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.sobregiro = 0;
    }

    @Override
    public void retirar(float cantidad) {
        if (saldo >= cantidad) {
            super.retirar(cantidad);
        } else {
            float restante = cantidad - saldo;
            sobregiro += restante;
            saldo = 0;
            System.out.println("Se ha utilizado sobregiro por: " + restante);
        }
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();
        if (sobregiro > 0) {
            System.out.println("Sobregiro actual: " + sobregiro);
        }
    }

    public void imprimir() {
        System.out.println("Cuenta Corriente:");
        System.out.println("Saldo: " + saldo);
        System.out.println("Sobregiro: " + sobregiro);
        System.out.println("Número de consignaciones: " + numeroConsignaciones);
        System.out.println("Número de retiros: " + numeroRetiros);
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("Comisión mensual: " + comisionMensual);
    }
}
