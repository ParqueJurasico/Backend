package org.example.jurasickpark.Dinosaurios;

public class Carnivoro extends Dinosaurio {
    public Carnivoro(String nombre, int edad) {
        super(nombre, "Carnivoro", edad); // Pasar el tipo directamente
    }

    @Override
    public void alimentar() {
        if (this.getNivelHambre() > 0) {
            this.setNivelHambre(Math.max(0, this.getNivelHambre() - 30)); // Reduce el hambre en 30
        }
    }

    @Override
    public void monitorearSalud() {
        if (this.getNivelHambre() > 70) {
            this.setNivelSalud(50); // Reduce salud si tiene hambre alta
        }
    }
}
