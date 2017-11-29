/**
 * Clase PERRO que hereda de animal.
 * @author yofeliz
 */
public class Perro extends Animal {
    //Variable que almacena el sonido del perro.
    private String ladrido = "";
    
    public Perro(String sonido) {
        System.out.println("¡PERRO!");
        ladrido = sonido;
    }//Constructor.
    
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace \"" + ladrido + "\".");
    }//hacerSonido (sobreescrito)
}//Perro