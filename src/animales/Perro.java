package animales;

public class Perro extends Animal {

    Perro(String nombre){
                        /// Este es el constructor del animal
        super(nombre);
    }

                        /// Esta es la primera función del perro
    public void traerZapatillas(){
        System.out.println("Toma amo, tus zapatillas");
    }

                        /// Como el perro hace un sonido ÚNICO, tiene su propia forma:
    @Override
    public void comunicarse(){
        System.out.println("guau");
    }
}
