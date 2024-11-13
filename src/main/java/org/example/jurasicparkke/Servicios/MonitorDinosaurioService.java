package src.main.java.org.example.jurasicparkke.Servicios;

// MonitorDinosaurioService.java
import src.main.java.org.example.jurasicparkke.Sensor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MonitorDinosaurioService {
    private SensorService sensorService;
    private ExecutorService executorService;

    public MonitorDinosaurioService(SensorService sensorService) {
        this.sensorService = sensorService;
        this.executorService = Executors.newFixedThreadPool(4);
    }

    public void iniciarMonitoreo(Sensor sensor) {
        executorService.submit(() -> {
            while (true) {
                sensor.medir();
                if (sensor.medidaFueraDeRango()) {
                    sensor.alertarSiFueraDeRango();
                }
                try {
                    Thread.sleep(5000); // Simulación de intervalo de monitoreo
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
    }

    public void detenerMonitoreo() {
        executorService.shutdown();
    }
}
