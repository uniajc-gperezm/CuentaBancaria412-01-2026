package com.uniajc;

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

    }

    public void retirar(float cantidad) {

    }

    public void calcularInteres() {

    }

    public void extractoMensual() {

    }
    

}
