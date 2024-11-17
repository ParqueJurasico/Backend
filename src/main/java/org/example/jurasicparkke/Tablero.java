package src.main.java.org.example.jurasicparkke;

import src.main.java.org.example.jurasicparkke.Dinosaurios.Dinosaurio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tablero {
    private String nombre;
    private Casilla[][] casillas;
    private int filas;
    private int columnas;

    public Tablero(String nombre, int filas, int columnas) {
        this.nombre = nombre;
        this.filas = filas;
        this.columnas = columnas;
        this.casillas = new Casilla[filas][columnas];
        inicializarCasillas();
    }

    private void inicializarCasillas() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                casillas[i][j] = new Casilla(i, j);
            }
        }
    }

    public boolean posicionarDinosaurio(Dinosaurio dinosaurio, int fila, int columna) {
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            Casilla casilla = casillas[fila][columna];
            if (!casilla.estaOcupada()) {
                casilla.setDinosaurio(dinosaurio);
                return true;
            }
        }
        return false;
    }

    public boolean moverDinosaurio(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        if (filaDestino >= 0 && filaDestino < filas && columnaDestino >= 0 && columnaDestino < columnas) {
            Casilla origen = casillas[filaOrigen][columnaOrigen];
            Casilla destino = casillas[filaDestino][columnaDestino];

            if (origen.estaOcupada() && !destino.estaOcupada()) {
                destino.setDinosaurio(origen.getDinosaurio());
                origen.vaciar();
                return true;
            }
        }
        return false;
    }

    public void imprimirTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(casillas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Casilla[][] getCasillas() {
        return casillas;
    }

    public void setCasillas(Casilla[][] casillas) {
        this.casillas = casillas;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
}
