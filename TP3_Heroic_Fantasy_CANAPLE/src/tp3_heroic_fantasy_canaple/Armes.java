/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_canaple;

/**
 *
 * @author adrie
 */
public abstract class Armes {
    String nom;
    protected int niveauAttaque;

    public Armes(String nom, int niveauAttaque) {
        this.nom = nom;
        if (niveauAttaque<=100 & niveauAttaque >=0){
        this.niveauAttaque = niveauAttaque;
        }
        else{
            this.niveauAttaque = 100;
        }
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", niveauAttaque=" + niveauAttaque + '}';
    }
    
    
}
