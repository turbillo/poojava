import java.util.ArrayList;


public class MisCoches {
    public static void main(String[] args) {
        //Coche[] listaCoches = new Coche[10];
        ArrayList<Coche> listaCoches = new ArrayList<>();

        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Ford", "Mustang");

        listaCoches.add(coche1);
        listaCoches.add(coche2);

        System.out.println("Mis Coches:");
        for (Coche coche : listaCoches) {
            System.out.println(coche.obtenerInformacion());
        }
    }
}
