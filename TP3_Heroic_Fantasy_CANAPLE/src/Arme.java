/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adrie
 */
public class Arme {
    String nom;
    private int niveauAttaque;

    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        if (niveauAttaque <= 100 & niveauAttaque >=0){
        this.niveauAttaque = niveauAttaque;
        }
        else {
            this.niveauAttaque = 100;
        }
        
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }
    
}
