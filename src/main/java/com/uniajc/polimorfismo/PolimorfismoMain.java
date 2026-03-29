package com.uniajc.polimorfismo;

public class PolimorfismoMain {
    public static void main(String[] args) {
        // Crear instancias de las clases derivadas
        Animal miAnimal = new Animal();
        Animal perro = new Perro();
        Animal gato = new Gato();

        // Llamar al método hacerSonido() para cada animal
        miAnimal.hacerSonido(); // Salida: El animal hace un sonido.
        perro.hacerSonido(); // Salida: El perro hace: ¡Guau!
        gato.hacerSonido();  // Salida: El gato hace: ¡Miau!
    }
}
