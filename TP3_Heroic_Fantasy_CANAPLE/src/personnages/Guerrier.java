/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

/**
 *
 * @author adrie
 */
public class Guerrier extends personnages {
    boolean cheval;

    public Guerrier(String nom, int niveauDeVie, boolean cheval) {
        super(nom, niveauDeVie);
        this.cheval = cheval;
    }

    @Override
    public String toString() {
        return "Guerrier{ nom = "+nom+ " niveau de vie = "+ niveauDeVie + "cheval=" + cheval + '}';
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
}
