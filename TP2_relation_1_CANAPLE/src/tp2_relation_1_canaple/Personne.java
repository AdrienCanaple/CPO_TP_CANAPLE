/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_canaple;

/**
 *
 * @author adrie
 */
public class Personne {
    
    String nom;
    String prenom;
    int nbVoitures ;
    Voiture [] liste_voitures ;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        liste_voitures = new Voiture [3] ;
        this.nbVoitures = 0;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        
        if (voiture_a_ajouter.Proprietaire != null){
            return false;
        }
        if (nbVoitures>=3){
            return false;
        }
        else{
            if (nbVoitures == 0){
            liste_voitures [0] = voiture_a_ajouter;
        }
        else if (nbVoitures == 1){
            liste_voitures [1] = voiture_a_ajouter;
        }
        else if (nbVoitures == 2){
            liste_voitures [2] = voiture_a_ajouter;
        }
        nbVoitures++;
        voiture_a_ajouter.Proprietaire = this ; 
        return true;
        }
        

}

}
