package org.example.jurasickpark.Dinosaurios;

public class Carnivoro extends Dinosaurio {
    public Carnivoro(String nombre, int edad) {
        super(nombre, tipo, edad);
    }

    @Override
    public void alimentar() {
        if (this.getNivelHambre() > 0) {
            this.setNivelHambre(Math.max(0, this.getNivelHambre() - 30)); // Reduce el hambre en 30
            System.out.println(this.getNombre() + " ha sido alimentado. Nivel de hambre: " + this.getNivelHambre());
        } else {
            System.out.println(this.getNombre() + " no tiene hambre.");
        }
    }

    @Override
    public void monitorearSalud() {
        if (this.getNivelSalud() > 70) {
            this.setNivelSalud(Integer.parseInt("Enfermo"));
        } else {
            this.setNivelSalud(Integer.parseInt("Saludable"));
        }
        System.out.println(this.getNombre() + " está en estado de salud: " + this.getNivelSalud());
    }
}
