package src.main.java.org.example.jurasicparkke.Servicios;
import src.main.java.org.example.jurasicparkke.Sensor;

import java.util.HashMap;
import java.util.Map;

public class SensorService {
    private Map<String, Sensor> sensorRepository = new HashMap<>();

    public Sensor createSensor(Sensor sensor) {
        sensorRepository.put(sensor.getId(), sensor);
        return sensor;
    }

    public Sensor findSensorById(String id) {
        return sensorRepository.get(id);
    }

    public void deleteSensor(String id) {
        sensorRepository.remove(id);
    }
}
