/*
 * Adrien CANAPLE
 * TP0 Partie 3 
 */
package tp0.exo3;
import java.util.Scanner;
/**
 *
 * @author adrie
 */
public class TP0Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter the operator:"+"\n"+"1) add"+"\n"+"2) substract"+"\n"+"3) multiply"+"\n"+"4) divide"+"\n"+"5) modulo);"+"\n");
        int operateur = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le numéro de l'opérateur souhaité :");
        operateur=sc.nextInt();
    }
}
