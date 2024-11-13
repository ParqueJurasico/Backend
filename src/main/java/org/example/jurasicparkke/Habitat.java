package src.main.java.org.example.jurasicparkke;

// Habitat.java
import src.main.java.org.example.jurasicparkke.Dinosaurios.Dinosaurio;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Habitat {
    private String id;
    private String nombre;
    private String tipo;
    private double temperatura;
    private List<Dinosaurio> dinosaurios;

    public Habitat(String nombre, String tipo, double temperatura) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.tipo = tipo;
        this.temperatura = temperatura;
        this.dinosaurios = new ArrayList<>();
    }

    public void ajustarTemperatura(double nuevaTemperatura) {
        this.temperatura = nuevaTemperatura;
    }

    public void agregarDinosaurio(Dinosaurio dinosaurio) {
        this.dinosaurios.add(dinosaurio);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public List<Dinosaurio> getDinosaurios() {
        return dinosaurios;
    }

    public void setDinosaurios(List<Dinosaurio> dinosaurios) {
        this.dinosaurios = dinosaurios;
    }
}
