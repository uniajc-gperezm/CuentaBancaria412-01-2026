package com.uniajc.banco;

public class Cuenta {
    
    protected float saldo;
    protected int numeroConsignaciones;
    protected int numeroRetiros;
    protected float tasaAnual;
    protected float comisionMensual;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad) {
        saldo += cantidad;
    }

    public void retirar(float cantidad) {
        if (saldo < cantidad) {
            System.out.println("No se puede retirar la cantidad solicitada su saldo disponible es: " + saldo);
            return;
        }
        saldo -= cantidad;
        // numeroRetiros++;
        numeroRetiros = numeroRetiros + 1;
    }

    public void calcularInteres() {
        float interesMensual = saldo * (tasaAnual / 12);
        saldo += interesMensual;
        // saldo = saldo + interesMensual;
    }

    public void extractoMensual() {
        calcularInteres();
        saldo -= comisionMensual;
    }
    

}
