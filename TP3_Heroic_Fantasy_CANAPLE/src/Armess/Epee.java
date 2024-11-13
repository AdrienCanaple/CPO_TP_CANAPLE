/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armess;

import Armess.Armes;

/**
 *
 * @author adrie
 */
public class Epee extends Armes {
    int finesse;

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        if (finesse <100 & finesse >=0){
        this.finesse = finesse;
        }
        else{
            this.finesse = 10;
        }
        
    }

    @Override
    public String toString() {
        return "Epee{"+ " Nom = "+ nom+ ", niveau attaque = "+ niveauAttaque + ", finesse=" + finesse + '}';
    }
    
}
