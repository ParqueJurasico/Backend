package org.example.jurasickpark.Servicios;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.types.ObjectId;
import org.example.jurasickpark.Dinosaurios.Dinosaurio;

import static com.mongodb.client.model.Filters.eq;

public class DinosaurioService {
    private final MongoCollection<Dinosaurio> dinosaurioCollection;

    public DinosaurioService(MongoDatabase database) {
        this.dinosaurioCollection = database.getCollection("dinosaurios", Dinosaurio.class);
    }

    public void agregarDinosaurio(Dinosaurio dinosaurio) {
        dinosaurioCollection.insertOne(dinosaurio);
    }

    public Dinosaurio buscarDinosaurioPorId(ObjectId id) {
        return dinosaurioCollection.find(eq("_id", id)).first();
    }

    public void alimentarDinosaurio(ObjectId id, int cantidad) {
        Dinosaurio dinosaurio = buscarDinosaurioPorId(id);
        if (dinosaurio != null) {
            dinosaurio.setNivelHambre(Math.max(0, dinosaurio.getNivelHambre() - cantidad));
            dinosaurioCollection.replaceOne(eq("_id", id), dinosaurio);
        }
    }

    public void devorarDinosaurio(ObjectId depredadorId, ObjectId presaId) {
        Dinosaurio depredador = buscarDinosaurioPorId(depredadorId);
        Dinosaurio presa = buscarDinosaurioPorId(presaId);

        if (depredador != null && presa != null && "Carnivoro".equalsIgnoreCase(depredador.getTipo())) {
            // Aumentar salud y reducir hambre del depredador
            depredador.setNivelSalud(Math.min(100, depredador.getNivelSalud() + 20));
            depredador.setNivelHambre(Math.max(0, depredador.getNivelHambre() - 50));

            // Eliminar a la presa
            dinosaurioCollection.deleteOne(eq("_id", presaId));
            dinosaurioCollection.replaceOne(eq("_id", depredadorId), depredador);
        }
    }

    public void incrementarMaduracion(ObjectId id) {
        Dinosaurio dinosaurio = buscarDinosaurioPorId(id);
        if (dinosaurio != null) {
            dinosaurio.setEdad(dinosaurio.getEdad() + 1);
            dinosaurioCollection.replaceOne(eq("_id", id), dinosaurio);
        }
    }
}

