/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import personnages.personnages;
import personnages.personnages;

/**
 *
 * @author adrie
 */
public class Magicien extends personnages {
    boolean confirmé;
    static int nombreMagicien = 0;

    public Magicien(String nom, int niveauDeVie, boolean confirmé) {
        super(nom, niveauDeVie);
        this.confirmé = confirmé;
        nombreMagicien++;
    }

    @Override
    public String toString() {
        return "Magicien{ nom = "+ nom +" niveau de vie = "+ niveauDeVie + " confirmé = " + confirmé + " Arme en main = " + armeEnMain+'}';
    }

    public void setConfirmé(boolean confirmé) {
        this.confirmé = confirmé;
    }
    
    public void finalize(){
        try {
            nombreMagicien -= 1;
        } finally {
            super.finalize();
        }
    }
}
