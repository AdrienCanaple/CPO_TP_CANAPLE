/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_canaple;

/**
 *
 * @author adrie
 */

public class BouteilleBiere {
    
    String Nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;
    
public void lireEtiquette () {
    System.out.println("Bouteille de " + Nom + " degreAlcool "+ degreAlcool +"\n"+"Brasserie : " + brasserie ) ;
}
}
