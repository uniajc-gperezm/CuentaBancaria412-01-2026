package com.uniajc.casting;

public class TarjetaCredito extends Pago {
    int cuotas;

    TarjetaCredito(double monto, int cuotas) {
        super(monto);
        this.cuotas = cuotas;
    }

    @Override
    void procesar() {
        System.out.println("Procesando pago con Tarjeta de Crédito por $" + monto);
    }

    // Método específico que NO existe en la clase Pago
    void calcularInteresCuotas() {
        double total = monto + (monto * 0.05 * cuotas);
        System.out.println("Total con intereses en " + cuotas + " cuotas: $" + total);
    }
}
