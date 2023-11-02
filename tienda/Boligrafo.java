package tienda;

public class Boligrafo {
    private String color;
    private double precio;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }
    
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public Boligrafo(String color, double precio) {
        this.color = color;
        this.precio = precio;
    }

    // Getters y setters, y otros métodos si es necesario
}
