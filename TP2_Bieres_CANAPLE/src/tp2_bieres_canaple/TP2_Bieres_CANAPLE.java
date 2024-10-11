/*
 * Adrien CANAPLE
 * TP2 Exo 1
 * 27/09/2024
 */
package tp2_bieres_canaple;

/**
 *
 * @author adrie
 */
public class TP2_Bieres_CANAPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BouteilleBiere UneBiere = new BouteilleBiere ("Leffe",6.6,"Abbaye de Leffe");
        BouteilleBiere DeuxBiere = new BouteilleBiere ("Despe",7,"despe");
        BouteilleBiere TroisBiere = new BouteilleBiere ("Pelican",7.6,"Pel");
        BouteilleBiere QuatreBiere = new BouteilleBiere ("8.6",9,"Abbaye du 86");
        
        QuatreBiere.Décapsuler();
        DeuxBiere.Décapsuler();
        
        System.out.println(DeuxBiere) ;
        System.out.println(TroisBiere);
    }
}
