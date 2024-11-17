package src.main.java.org.example.jurasicparkke;

import src.main.java.org.example.jurasicparkke.Dinosaurios.Carnivoro;
import src.main.java.org.example.jurasicparkke.Dinosaurios.Dinosaurio;
import src.main.java.org.example.jurasicparkke.Dinosaurios.Herbivoro;
import src.main.java.org.example.jurasicparkke.Dinosaurios.Omnivoro;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IslaManager {
    private List<Tablero> tableros;

    public IslaManager() {
        this.tableros = new ArrayList<>();
        inicializarIslas();
    }

    private void inicializarIslas() {
        tableros.add(new Tablero("Isla de Crianza", 10, 10));
        tableros.add(new Tablero("Isla de Enfermería", 10, 10));
        tableros.add(new Tablero("Isla de Voladores", 10, 10));
        tableros.add(new Tablero("Isla de Terrestres", 10, 10));
        tableros.add(new Tablero("Isla de Acuáticos", 10, 10));
    }

    public void asignarDinosaurios(List<Dinosaurio> dinosaurios) {
        Random random = new Random();
        for (Dinosaurio dinosaurio : dinosaurios) {
            Tablero tablero = seleccionarTablero(dinosaurio);
            int fila = random.nextInt(tablero.getFilas());
            int columna = random.nextInt(tablero.getColumnas());
            boolean colocado = tablero.posicionarDinosaurio(dinosaurio, fila, columna);
            while (!colocado) {
                fila = random.nextInt(tablero.getFilas());
                columna = random.nextInt(tablero.getColumnas());
                colocado = tablero.posicionarDinosaurio(dinosaurio, fila, columna);
            }
        }
    }

    private Tablero seleccionarTablero(Dinosaurio dinosaurio) {
        if (dinosaurio instanceof Carnivoro) {
            return tableros.get(3); // Isla de Terrestres
        } else if (dinosaurio instanceof Herbivoro) {
            return tableros.get(3); // Isla de Terrestres
        } else if (dinosaurio instanceof Omnivoro) {
            return tableros.get(0); // Isla de Crianza
        } else {
            return tableros.get(1); // Enfermería como fallback
        }
    }

    public void imprimirTableros() {
        for (Tablero tablero : tableros) {
            System.out.println("Tablero: " + tablero.getNombre());
            tablero.imprimirTablero();
            System.out.println();
        }
    }
}
