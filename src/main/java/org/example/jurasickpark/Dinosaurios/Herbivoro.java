package org.example.jurasickpark.Dinosaurios;

public class Herbivoro extends Dinosaurio {
    public Herbivoro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void alimentar() {
        if (this.getNivelHambre() > 0) {
            this.setNivelHambre(Math.max(0, this.getNivelHambre() - 20)); // Reduce el hambre en 20
            System.out.println(this.getNombre() + " ha sido alimentado. Nivel de hambre: " + this.getNivelHambre());
        } else {
            System.out.println(this.getNombre() + " no tiene hambre.");
        }
    }

    @Override
    public void monitorearSalud() {
        if (this.getNivelHambre() > 50) {
            this.setEstadoSalud("Hambriento");
        } else {
            this.setEstadoSalud("Saludable");
        }
        System.out.println(this.getNombre() + " está en estado de salud: " + this.getEstadoSalud());
    }
}
