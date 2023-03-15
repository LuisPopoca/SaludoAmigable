package saludoamigable;
import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Scanner
 * Este programa despliega un saludo Hola personalizado.
 *
 */

public class SaludoAmigable {
    Scanner stdIn = new Scanner(System.in);

    public static void main(String[] args) {

        
        String nombre="";
        
        SaludoAmigable in = new SaludoAmigable();
        in .In(nombre);
        
        

    }
    
    public void In(String nombre){
        System.out.print("Introduce tu nombre: ");
        nombre = stdIn.nextLine();
        System.out.println("¡Hola " + nombre + "!");
    }

}
