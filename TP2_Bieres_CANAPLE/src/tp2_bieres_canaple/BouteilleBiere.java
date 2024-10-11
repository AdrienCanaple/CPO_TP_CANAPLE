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
    double degreAlcool;
    String brasserie;
    boolean ouverte;

public void lireEtiquette () {
    System.out.println("Bouteille de " + Nom +"\n"+ "degré d'alcool "+ degreAlcool +"\n"+"Brasserie : " + brasserie ) ;
}
public void Décapsuler (){
    if(ouverte == false){
        System.out.println("la biere est ouverte");
        ouverte=true;
}
    else{
        System.out.println("Erreur : la bière est déja ouverte");
    }
}
public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
    Nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
}
@Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = Nom + " (" + degreAlcool + " degrés)Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}
}

