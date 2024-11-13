package src.main.java.org.example.jurasicparkke.Dinosaurios;
// Dinosaurio.java
import java.util.UUID;

public abstract class Dinosaurio {
    private String id;
    private String nombre;
    private int edad;
    private String estadoSalud;
    private int nivelHambre;

    public Dinosaurio(String nombre, int edad) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.edad = edad;
        this.estadoSalud = "Saludable";
        this.nivelHambre = 0;
    }

    public abstract void alimentar();
    public abstract void monitorearSalud();
    public void incrementarMaduracion() {
        this.edad++;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public int getNivelHambre() {
        return nivelHambre;
    }

    public void setNivelHambre(int nivelHambre) {
        this.nivelHambre = nivelHambre;
    }
}






