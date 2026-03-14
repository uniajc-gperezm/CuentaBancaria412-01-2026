package com.uniajc.banco;

public class Cuenta {
    
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    // Método para consignar una cantidad de dinero en la cuenta actualizando su saldo.
    public void consignar(float cantidad) {
        if(cantidad > 0) {
            saldo += cantidad;
            numeroConsignaciones++;
        } else {
            System.out.println("La cantidad a consignar debe ser mayor que cero.");
        }
    }

    // Método para retirar una cantidad de dinero en la cuenta actualizando su saldo. El valor a retirar no debe superar el saldo.
    public void retirar(float cantidad) {
        if(cantidad > 0) {
            if(cantidad <= saldo) {
                saldo -= cantidad;
                numeroRetiros++;
            } else {
                System.out.println("Fondos insuficientes. Retiro no realizado.");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser mayor que cero.");
        }
    }

    // Método para calcular el interés mensual de la cuenta y actualiza el saldo correspodiente.
    public void calcularInteres() {
        float interesMensual = saldo * (tasaAnual/12);
        saldo += interesMensual;
    }

    // Método para calcular el extracto mensual, y que actualice el saldo restandole la comisión mensual
    // y calculando el interes mensual correspondiente (invoca el método calcularInteres).
    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteres();
    }

    // Método para imprimir mostrando en pantalla los valores de los atributos.
    public void imprimir() {
        System.out.println("Saldo: $" +saldo);
        System.out.println("Número de consignaciones: " +numeroConsignaciones);
        System.out.println("Número de retiros: " +numeroRetiros);
        System.out.println("Tasa anual: " +tasaAnual+ "%");
        System.out.println("Comisión mensual: $" +comisionMensual);
    }
}
