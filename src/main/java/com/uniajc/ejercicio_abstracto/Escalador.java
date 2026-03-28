package com.uniajc.ejercicio_abstracto;

public class Escalador extends Ciclista {
    private float aceleracionPromedioSubida;
    private float gradoRampaSoportada;

    public Escalador(int identificador, String nombre, int tiempoAcumulado, float aceleracionPromedioSubida, float gradoRampaSoportada) {
        super(identificador, nombre, tiempoAcumulado);
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
    public void imprimir() {
        super.imprimir();
        System.out.println("Aceleración promedio subida: " + aceleracionPromedioSubida + " m/s2");
        System.out.println("Grado rampa soportada: " + gradoRampaSoportada + " grados");
    }

    @Override
    public String imprimirTipo() {
        return "Es un Escalador";
    }
}
