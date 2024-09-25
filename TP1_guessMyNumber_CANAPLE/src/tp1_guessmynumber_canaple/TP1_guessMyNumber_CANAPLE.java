/*
 *Adrien CANAPLE
 * TP1 Exo 3 guess my number
 * 25/09/2024
 */
package tp1_guessmynumber_canaple;

import java.util.Random;

/**
 *
 * @author adrie
 */
public class TP1_guessMyNumber_CANAPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generateurAleat = new Random();
        for (int i = 0; i<5;i++){
            int n = generateurAleat.nextInt(100);
            System.out.println(n);
        }
        
    }
    
}
