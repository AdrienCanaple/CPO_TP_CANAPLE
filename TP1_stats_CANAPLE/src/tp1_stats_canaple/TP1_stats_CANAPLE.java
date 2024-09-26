/*
 * Adrien CANAPLE
 * 26/09/2024
 * TP1 Exo4 statistique
 */
package tp1_stats_canaple;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author adrie
 */
public class TP1_stats_CANAPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var1 = 0;
        int aleat = 0;
        int tab [];
        tab = new int[6];
        for (int i=0;i<5;i++){
            tab[i]=0;
        }
        Scanner sc = new Scanner(System.in);
        var1 = sc.nextInt();
        Random generateurAleat = new Random();
        for (int ii=0;ii<var1;ii++){
            aleat = generateurAleat.nextInt(5);
            tab[aleat]++;
        }
        for (int iii = 0; iii<6;iii++){
            System.out.println(tab[iii]);
        }
    }
    
}
