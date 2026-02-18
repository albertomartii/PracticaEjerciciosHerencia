package animales;

public class PerroCojo extends Perro{

    PerroCojo(String nombre){
                    /// Este es el constructor del animal->perro
        super(nombre);
    }

                    ///  Este perro no puede andar, por lo tanto tiene un resultado
                    ///  diferente en esta función. Pero al no ser otra cosa que no sea "Imprimir algo"
                    ///  se deja como está y se cambia el contenido a imprimir.

    public void traerZapatillas(){
        System.out.println("Yo no ando, se lo pides al otro perro");
    }

                    /// Como hace el mismo ruido que un perro normal, no se sobreescribe

    public void comunicarse(){
        System.out.println("guau");
    }
}
