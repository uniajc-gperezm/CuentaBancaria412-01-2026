package com.uniajc.interfaces.contratos;

public interface IProveedor {
    public default void suministrar() {
        System.out.println("Suministrando productos...");
    }
}
