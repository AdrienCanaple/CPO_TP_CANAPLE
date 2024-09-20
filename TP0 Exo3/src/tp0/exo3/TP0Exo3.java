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
        int operande1 = 0;
        int operande2 = 0;
        int resultat = 0;
        Scanner sc = new Scanner(System.in);
        while (operateur<1 || operateur>5){
            System.out.println("Entrer le numero de l operateur souhaite :");
            operateur=sc.nextInt();
        }
        if (operateur<1 || operateur>5){
            System.out.println("cet operateur n existe pas");
        }
        System.out.println("Entrez un premier nombre");
        operande1=sc.nextInt();
        System.out.println("Entrez un second nombre");
        operande2=sc.nextInt();
        //System.out.println(operateur + " " + operande1 + " " + operande2);
        if (operateur == 1){
            resultat = operande1+operande2;
        }
        if (operateur == 2){
            resultat = operande1-operande2;
        }
        if (operateur == 3){
            resultat = operande1*operande2;
        }
        if (operateur == 4){
            resultat = operande1/operande2;
        }
        if (operateur == 5){
            resultat = operande1%operande2;
        }
        System.out.println("Le resultat est "+ resultat);
        
    }
}
