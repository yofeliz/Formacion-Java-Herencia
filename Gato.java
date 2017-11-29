/**
 * Clase GATO que hereda de animal.
 * @author yofeliz
 */
public class Gato extends Animal {
    //Variable que almacena el sonido del gato.
    private String maullido = "";
    
    public Gato(String sonido) {
        System.out.println("¡GATO!");
        maullido = sonido;
    }//Constructor
    
    @Override
    public void hacerSonido() {
        System.out.println("El gato hace \"" + maullido + "\".");
    }//hacerSonido (sobreescrito)
}//Gato