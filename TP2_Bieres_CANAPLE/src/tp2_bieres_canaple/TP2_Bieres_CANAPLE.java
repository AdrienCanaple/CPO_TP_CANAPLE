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
        BouteilleBiere uneBiere = new BouteilleBiere ();
        uneBiere.Nom = "Cuvée des trolls";
        uneBiere.degreAlcool = (float) 7.0 ;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;
        uneBiere.lireEtiquette();
        BouteilleBiere secondeBiere = new BouteilleBiere();
        secondeBiere.Nom = "Leffe";
        secondeBiere.degreAlcool = (float) 6.6;
        secondeBiere.brasserie = "Abbaye de Leffe";
        secondeBiere.lireEtiquette();
    }
    
}
