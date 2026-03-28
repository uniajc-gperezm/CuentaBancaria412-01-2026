package com.uniajc.ejercicio_abstracto;

public class Escalador extends Ciclista {

    private float aceleracionPromedioSubida;
    private float gradoRampa;

    public Escalador(int id, String nombre, float aceleracion, float grado) {
        super(id, nombre);
        this.aceleracionPromedioSubida = aceleracion;
        this.gradoRampa = grado;
    }

    @Override
    public String imprimirTipo() {
        return "Escalador";
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Aceleración promedio subida: " + aceleracionPromedioSubida);
        System.out.println("Grado de rampa: " + gradoRampa);
    }
}
