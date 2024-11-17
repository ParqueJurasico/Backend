package org.example.jurasickpark.Dinosaurios;

public class Omnivoro extends Dinosaurio {
    public Omnivoro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void alimentar() {
        if (this.getNivelHambre() > 0) {
            this.setNivelHambre(Math.max(0, this.getNivelHambre() - 25)); // Reduce el hambre en 25
            System.out.println(this.getNombre() + " ha sido alimentado. Nivel de hambre: " + this.getNivelHambre());
        } else {
            System.out.println(this.getNombre() + " no tiene hambre.");
        }
    }

    @Override
    public void monitorearSalud() {
        if (this.getNivelHambre() > 60) {
            this.setEstadoSalud("Hambriento");
        } else {
            this.setEstadoSalud("Saludable");
        }
        System.out.println(this.getNombre() + " está en estado de salud: " + this.getEstadoSalud());
    }
}
