package com.uniajc.casting;

public class Efectivo extends Pago {

    Efectivo(double monto) {
        super(monto);
    }

    @Override
    void procesar() {
        System.out.println("Procesando pago en efectivo de $" + monto);
    }

    void entregarCambio() {
        System.out.println("Entregando cambio para el pago en efectivo de $" + monto);
    }

}
