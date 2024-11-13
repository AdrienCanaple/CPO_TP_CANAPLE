/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

/**
 *
 * @author adrie
 */
public class Magicien extends personnages {
    boolean confirmé;

    public Magicien(String nom, int niveauDeVie, boolean confirmé) {
        super(nom, niveauDeVie);
        this.confirmé = confirmé;
    }

    @Override
    public String toString() {
        return "Magicien{ nom = "+ nom +" niveau de vie = "+ niveauDeVie + " confirmé = " + confirmé + '}';
    }

    public void setConfirmé(boolean confirmé) {
        this.confirmé = confirmé;
    }
}
