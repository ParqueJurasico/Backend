package org.example.jurasickpark.Dinosaurios;

import org.bson.types.ObjectId;

public class Dinosaurio {
    private ObjectId id;
    private String nombre;
    private String tipo; // Carnivoro, Herbivoro, Omnivoro
    private int edad;
    private int nivelSalud; // 0 a 100
    private int nivelHambre; // 0 a 100

    public Dinosaurio(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.nivelSalud = 100; // Comienza saludable
        this.nivelHambre = 0; // Comienza sin hambre
    }

    // Getters y setters
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public int getNivelHambre() {
        return nivelHambre;
    }

    public void setNivelHambre(int nivelHambre) {
        this.nivelHambre = nivelHambre;
    }
}
