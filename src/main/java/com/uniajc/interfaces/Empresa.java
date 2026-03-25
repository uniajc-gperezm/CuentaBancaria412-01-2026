package com.uniajc.interfaces;

import com.uniajc.interfaces.contratos.*;

public class Empresa implements IEmpleado, IJefe, IProveedor {
    @Override
    public void trabajar() {
        System.out.println("Trabajando en la empresa...");
    }

    @Override
    public void dirigir() {
        System.out.println("Dirigiendo la empresa...");
    }

    // @Override
    // public void suministrar() { 
    //     System.out.println("Suministrando productos a la empresa...");
    // }
}
