package src.main.java.org.example.jurasicparkke.Servicios;

import src.main.java.org.example.jurasicparkke.Dinosaurios.Dinosaurio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DinosaurioService {
    private Map<String, Dinosaurio> dinosaurioRepository = new HashMap<>();

    public Dinosaurio createDinosaurio(Dinosaurio dinosaurio) {
        dinosaurioRepository.put(dinosaurio.getId(), dinosaurio);
        return dinosaurio;
    }

    public Dinosaurio findDinosaurioById(String id) {
        return dinosaurioRepository.get(id);
    }

    public List<Dinosaurio> findAllDinosaurios() {
        return dinosaurioRepository.values().stream().collect(Collectors.toList());
    }

    public void deleteDinosaurio(String id) {
        dinosaurioRepository.remove(id);
    }
}
