package org.example.jurasickpark;

import org.example.jurasickpark.Dinosaurios.Dinosaurio;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DinosaurioManager {
    private final ExecutorService executorService = Executors.newFixedThreadPool(2); // Dos hilos: uno para alimentación, otro para maduración
    private final List<Dinosaurio> dinosaurios;

    public DinosaurioManager(List<Dinosaurio> dinosaurios) {
        this.dinosaurios = dinosaurios;
    }

    public void iniciarProcesosParalelos() {
        // Tarea para alimentar automáticamente
        executorService.submit(() -> {
            while (!executorService.isShutdown()) {
                try {
                    for (Dinosaurio dinosaurio : dinosaurios) {
                        dinosaurio.alimentar();
                    }
                    TimeUnit.MINUTES.sleep(1); // Esperar 1 minuto entre ciclos de alimentación
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });

        // Tarea para incrementar la maduración automáticamente
        executorService.submit(() -> {
            while (!executorService.isShutdown()) {
                try {
                    for (Dinosaurio dinosaurio : dinosaurios) {
                        dinosaurio.setEdad(dinosaurio.getEdad() + 1);
                    }
                    TimeUnit.MINUTES.sleep(1); // Esperar 1 minuto entre incrementos de edad
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });
    }

    public void detenerProcesos() {
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }
}
