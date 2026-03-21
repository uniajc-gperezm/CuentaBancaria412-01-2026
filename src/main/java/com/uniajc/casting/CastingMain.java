package com.uniajc.casting;

public class CastingMain {
    public static void main(String[] args) {
        // Creando un pago con tarjeta de crédito
        TarjetaCredito pagoTarjeta = new TarjetaCredito(100.0, 3);
        pagoTarjeta.procesar(); // Llamada al método de la clase TarjetaCredito
        pagoTarjeta.calcularInteresCuotas(); // Llamada al método específico de TarjetaCredito

        // Upcasting: Tratando a TarjetaCredito como Pago
        Pago pagoGenerico = pagoTarjeta; // Esto es un upcasting implícito
        pagoGenerico.procesar(); // Llamada al método procesar() de Pago (polimorfismo)

        // pagoGenerico.calcularInteresCuotas(); // Esto NO compila, ya que Pago no tiene este método

        Efectivo pagoEfectivo = new Efectivo(50.0);
        pagoEfectivo.procesar(); // Llamada al método de la clase Efectivo

        // Downcasting: Volviendo a tratar a Pago como TarjetaCredito
        if (pagoGenerico instanceof TarjetaCredito) {
            TarjetaCredito pagoEspecifico = (TarjetaCredito) pagoGenerico; // Downcasting explícito
            pagoEspecifico.calcularInteresCuotas(); // Ahora podemos llamar al método específico
        } else {
            System.out.println("El objeto no es una instancia de TarjetaCredito.");
        }
    }
}
