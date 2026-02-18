package animales;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Pancho");
        perro1.traerZapatillas();
        perro1.comunicarse();

        PerroCojo perro2 = new PerroCojo("Hotwheels");
        perro2.traerZapatillas();
        perro2.comunicarse();
    }
}
