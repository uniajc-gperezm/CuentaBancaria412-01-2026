package com.uniajc;

public class CuentaAhorro extends Cuenta {

    protected boolean activa;

    public CuentaAhorro(float saldo, float tasa_anual) {
        super(saldo, tasa_anual);
        this.activa = saldo >= 10000;
    }

    public void verificarEstado() {
        if (this.getSaldo() < 10000) {
            this.activa = false;
        } else {
            this.activa = true;
        }
    }

    public boolean isInactiva() {
        return !this.activa;
    }

    public void ejecutarOperacion() {
        if (!isInactiva()) {
            super.consignar(2000);
            super.retirar(1000);
            super.calcular_interes();
            if (num_retiros > 4) {
                this.saldo -= 1000;
                this.num_retiros++;
                System.out.println("nuevo saldo: " + this.saldo);
                super.extracto_mensual();
            } else {
                System.out.println("Numero de retiros: " + this.num_retiros);
            }
        } else {
            System.out.println("La cuenta está inactiva, no se puede operar.");
        }
    }

    public void imprimir2() {
        System.out.println("\n" + "Valores de los atributos de la clase cuentaAhorros:");
        System.out.println("Saldo Total: " + this.getSaldo());
        System.out.println("Comision mensual: " + this.comision_mensual);
        System.out.println("Numero de transacciones: " + (this.num_consignaciones + this.num_retiros));
        System.out.println("Estado de la cuenta: " + (isInactiva() ? "Inactiva" : "Activa"));
    }

}