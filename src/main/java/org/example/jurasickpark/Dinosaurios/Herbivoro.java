package org.example.jurasickpark.Dinosaurios;


public class Herbivoro extends Dinosaurio {
    public Herbivoro(String nombre, int edad) {
        super(nombre, "Herbivoro", edad); // Pasar el tipo directamente
    }

    @Override
    public void alimentar() {
        if (this.getNivelHambre() > 0) {
            this.setNivelHambre(Math.max(0, this.getNivelHambre() - 20)); // Reduce el hambre en 20
        }
    }

    @Override
    public void monitorearSalud() {
        if (this.getNivelHambre() > 60) {
            this.setNivelSalud(50); // Reduce salud si tiene hambre alta
        }
    }
}
