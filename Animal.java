import java.util.*;

/**
 * Programa de formación sobre herencia y timers.
 * @author yofeliz
 */
public class Animal {
    //Variable que almacena los objetos ANIMAL.
    private static ArrayList<Animal> animales;
    
    public Animal() {
        System.out.print("Construyendo un Animal... ");
    }//Constructor
    
    protected void hacerSonido() {
    }//hacerSonido (se sobreescribirá)
    
    public static void main(String[] params) {
        Perro    perro    = new Perro("Guau guau");
        Gato     gato     = new Gato("Miau miau");
        Elefante elefante = new Elefante("Brrr brrr");
        
        animales = new ArrayList<>();
        animales.add(perro);
        animales.add(gato);
        animales.add(elefante);
        
        TimerTask timer = new TimerTask() {
            @Override
            public void run() {
                hablarAnimales();
            }
        };
        
        Timer t = new Timer();
        t.schedule(timer, 0, 5000);
    }//main
    
    private static void hablarAnimales() {
        for(Animal animal: animales) {
            animal.hacerSonido();
        }
    }//hablarAnimales
}//Animal