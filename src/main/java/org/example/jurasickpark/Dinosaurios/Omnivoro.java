package org.example.jurasickpark.Dinosaurios;

public class Omnivoro extends Dinosaurio {
    public Omnivoro(String nombre, int edad) {
        super(nombre, "Omnivoro", edad); // Pasar el tipo directamente
    }

    @Override
    public void alimentar() {
        if (this.getNivelHambre() > 0) {
            this.setNivelHambre(Math.max(0, this.getNivelHambre() - 25)); // Reduce el hambre en 25
        }
    }

    @Override
    public void monitorearSalud() {
        if (this.getNivelHambre() > 65) {
            this.setNivelSalud(50); // Reduce salud si tiene hambre alta
        }
    }
}
