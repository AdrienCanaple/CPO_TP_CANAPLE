/*
 * Adrien CANAPLE
 * 17/10/2024
 * TP2 Exo 3
 */
package tp2_manip_canaple;

import java.util.Arrays;

/**
 *
 * @author adrie
 */
public class TP2_manip_CANAPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Tartiflette assiette1 = new Tartiflette(500) ;
    Tartiflette assiette2 = new Tartiflette(600) ;

    Tartiflette assiette3 = assiette2 ;
    
    assiette2 = assiette1 ;
    
    System.out.println("nb de calories de Assiette 2 : " +
    assiette2.nbCalories) ;
    System.out.println("nb de calories de Assiette 3 : " +
    assiette3.nbCalories) ;
        
    Moussaka [] tableauMoussaka = new Moussaka[10];
    
    
    for (int i=0;i<10;i++){
        Moussaka assietteMouss = new Moussaka(400+50*i);
        tableauMoussaka[i] = assietteMouss;
    }
    System.out.println(Arrays.toString(tableauMoussaka));
    }
    
}
