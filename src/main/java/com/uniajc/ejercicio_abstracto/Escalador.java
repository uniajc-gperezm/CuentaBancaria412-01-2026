package com.uniajc.ejercicio_abstracto;

public class Escalador extends Ciclista {
    private float aceleracionPromedioSubida;
    private float gradoRampaSoportada;

    public Escalador(int id, String nombre, float aceleracionPromedioSubida, float gradoRampaSoportada) {
        super(id, nombre);
        this.aceleracionPromedioSubida = aceleracionPromedioSubida;
        this.gradoRampaSoportada = gradoRampaSoportada;
    }

    public float getAceleracionPromedioSubida() {
        return aceleracionPromedioSubida;
    }

    public void setAceleracionPromedioSubida(float aceleracionPromedioSubida) {
        this.aceleracionPromedioSubida = aceleracionPromedioSubida;
    }

    public float getGradoRampaSoportada() {
        return gradoRampaSoportada;
    }

    public void setGradoRampaSoportada(float gradoRampaSoportada) {
        this.gradoRampaSoportada = gradoRampaSoportada;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Aceleración promedio en subida: " + aceleracionPromedioSubida + " m/s²");
        System.out.println("Grado de rampa soportada: " + gradoRampaSoportada + " grados");
    }

    @Override
    public String imprimirTipo() {
        return "Es un Escalador";
    }
}