
package com.uniajc.ejercicio1_interfaces;
import com.uniajc.ejercicio1_interfaces.Interfaz.Ovíparo;

public class Ornitorrinco extends Mamifero implements Ovíparo
{
    @Override
    public void amamantarCrias()
      {
        System.out.println("El ornitorrinco amamanta a sus crías");
      }

    @Override
    public void ponerHuevos()
      {
        System.out.println("El ornitorrinco pone huevos");
      }
}
