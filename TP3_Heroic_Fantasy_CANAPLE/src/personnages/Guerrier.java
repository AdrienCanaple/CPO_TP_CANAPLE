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
    static int nombreGuerrier = 0;

    public Guerrier(String nom, int niveauDeVie, boolean cheval) {
        super(nom, niveauDeVie);
        this.cheval = cheval;
        nombreGuerrier++;
    }

    @Override
    public String toString() {
        return "Guerrier{ nom = "+nom+ " niveau de vie = "+ niveauDeVie + "cheval=" + cheval +" Arme en main = " + armeEnMain+ '}';
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
    public void finalize(){
               nombreGuerrier = nombreGuerrier - 1;
    }
}
