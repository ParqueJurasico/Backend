package src.main.java.org.example.jurasicparkke;

// Isla.java
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Isla {
    private String id;
    private String nombre;
    private List<Habitat> habitats;

    public Isla(String nombre) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.habitats = new ArrayList<>();
    }

    public void agregarHabitat(Habitat habitat) {
        this.habitats.add(habitat);
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

    public List<Habitat> getHabitats() {
        return habitats;
    }

    public void setHabitats(List<Habitat> habitats) {
        this.habitats = habitats;
    }
}
