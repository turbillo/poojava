// Definición de una clase en Java
public class Coche {
    private String marca;
    private String modelo;

    

    // Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método para obtener la información del coche
    public String obtenerInformacion() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
}

