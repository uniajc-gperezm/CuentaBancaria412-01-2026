package com.uniajc.banco;

public class CuentaAhorro extends Cuenta {

    protected boolean activa;

    final String MENSAJE_CUENTA_INACTIVA = "La cuenta no está activa.";

    public CuentaAhorro(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if (saldo < 10000) {
            activa = false;
        } else {
            activa = true;
        }
    }

    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        } else {
            System.out.println(MENSAJE_CUENTA_INACTIVA);
        }
    }

    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        } else {
            System.out.println(MENSAJE_CUENTA_INACTIVA);
        }
    }

    public void extractoMensual() {
        if (numeroRetiros > 4)   {
            comisionMensual = numeroRetiros - 4;
        }
    }
    
    public void imprimir() {
        
    }
}
