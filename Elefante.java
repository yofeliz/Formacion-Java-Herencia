/**
 * Clase ELEFANTE que hereda de animal.
 * @author yofeliz
 */
public class Elefante extends Animal {
    //Variable que almacena el sonido del elefante.
    private String barrido = "";
    
    public Elefante(String sonido) {
        System.out.println("¡ELEFANTE!");
        barrido = sonido;
    }//Constructor
    
    @Override
    public void hacerSonido() {
        System.out.println("El elefante hace \"" + barrido + "\".");
    }//hacerSonido (sobreescrito)
}//Elefante