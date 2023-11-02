package tienda;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Object> inventario;

    public Tienda() {
        this.inventario = new ArrayList<>();
    }

    public void agregarBoligrafo(String color, double precio) {
        Boligrafo boligrafo = new Boligrafo(color, precio);
        inventario.add(boligrafo);
        System.out.println("Bolígrafo agregado al inventario.");
    }

    public void agregarLapicero(String color, double precio, int dureza) {
        Lapicero lapicero = new Lapicero(color, precio, dureza);
        inventario.add(lapicero);
        System.out.println("Lapicero agregado al inventario.");
    }

    public void agregarCuaderno(String color, double precio, int numHojas) {
        Cuaderno cuaderno = new Cuaderno(color, precio, numHojas);
        inventario.add(cuaderno);
        System.out.println("Cuaderno agregado al inventario.");
    }

    // Métodos para agregar otros tipos de productos (Libro, Estuche, Mochila, etc.)

    public void mostrarInventario() {
        System.out.println("Inventario de la tienda:");
        for (Object producto : inventario) {
            System.out.println(producto.toString());
        }
    }

    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        tienda.agregarBoligrafo("Azul", 1.5);
        tienda.agregarLapicero("Negro", 2.0, 2);
        tienda.agregarCuaderno("Rojo", 3.0, 100);

        // Agregar otros tipos de productos según sea necesario

        tienda.mostrarInventario();
    }
}
