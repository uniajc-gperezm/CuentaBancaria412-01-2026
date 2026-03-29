
package com.uniajc.ejercicio1_interfaces.Interfaz;

import com.uniajc.ejercicio1_interfaces.Ballena;

public class Main
{
   public static void main(String[] args) 
   {
        Ballena ballena = new Ballena();
        Ornitorrinco ornitorrinco = new Ornitorrinco();

        System.out.println("Ballena");

        ballena.amamantarCrias();

        
        System.out.println("Ornitorrinco");
        
        ornitorrinco.amamantarCrias();
        ornitorrinco.ponerHuevos();   
    } 
}
