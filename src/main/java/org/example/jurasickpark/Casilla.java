package org.example.jurasickpark;

import org.example.jurasickpark.Dinosaurios.Dinosaurio;

public class Casilla {
    private int fila;
    private int columna;
    private Dinosaurio dinosaurio;

    public Casilla(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.dinosaurio = null;
    }

    public boolean estaOcupada() {
        return dinosaurio != null;
    }

    public Dinosaurio getDinosaurio() {
        return dinosaurio;
    }

    public void setDinosaurio(Dinosaurio dinosaurio) {
        this.dinosaurio = dinosaurio;
    }

    public void vaciar() {
        this.dinosaurio = null;
    }

    @Override
    public String toString() {
        return estaOcupada() ? "D" : ".";
    }
}
