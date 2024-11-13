package src.main.java.org.example.jurasicparkke.Dinosaurios;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dinosaurios")
public abstract class Dinosaurio {
    @Id
    private String id;
    private String nombre;
    private int edad;
    private String estadoSalud;
    private int nivelHambre;

    public Dinosaurio(String nombre, int edad) {
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

    // Getters y Setters
}
