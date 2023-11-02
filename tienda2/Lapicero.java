package tienda2;

public class Lapicero {
    private String color;
    private double precio;
    private int dureza;

    public Lapicero(String color, double precio, int dureza) {
        this.color = color;
        this.precio = precio;
        this.dureza = dureza;
    }

    public String toString() {
        return "Lapicero(color=" + color + ", precio=" + precio + ", dureza=" + dureza + ")";
    }
    // Getters y setters, y otros métodos si es necesario
}
