package tienda;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        //Boligrafo boligrafo = new Boligrafo("Azul", 1.5);
        //Lapicero lapicero = new Lapicero("Negro", 2.0, 2);
        //Cuaderno cuaderno = new Cuaderno("Cuadriculado", 3.0, 200);

        tienda.agregarBoligrafo("Azul", 1.5);
        tienda.agregarLapicero("Negro", 2.0, 1);
        tienda.agregarCuaderno("Verde", 3.5, 200);

        tienda.mostrarInventario();
    }
}
