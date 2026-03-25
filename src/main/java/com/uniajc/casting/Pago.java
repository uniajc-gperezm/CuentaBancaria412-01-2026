package com.uniajc.casting;

public class Pago {
    double monto;

    Pago(double monto) {
        this.monto = monto;
    }

    void procesar() {
        System.out.println("Procesando pago genérico de $" + monto);
    }
}
