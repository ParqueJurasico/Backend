package org.example.jurasickpark;

import org.example.jurasickpark.Dinosaurios.Dinosaurio;

import java.util.UUID;

public class Sensor {
    private String id;
    private String tipoSensor;
    private Dinosaurio dinosaurio;

    public Sensor(String tipoSensor, Dinosaurio dinosaurio) {
        this.id = UUID.randomUUID().toString();
        this.tipoSensor = tipoSensor;
        this.dinosaurio = dinosaurio;
    }

    public void medir() {
        // Lógica para medir parámetros de salud
    }

    public void alertarSiFueraDeRango() {
        // Lógica para alertar si los valores están fuera de rango
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoSensor() {
        return tipoSensor;
    }

    public void setTipoSensor(String tipoSensor) {
        this.tipoSensor = tipoSensor;
    }

    public Dinosaurio getDinosaurio() {
        return dinosaurio;
    }

    public void setDinosaurio(Dinosaurio dinosaurio) {
        this.dinosaurio = dinosaurio;
    }
}
