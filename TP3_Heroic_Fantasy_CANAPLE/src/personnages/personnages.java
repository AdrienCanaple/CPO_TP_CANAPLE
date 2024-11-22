/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import Armess.Armes;
import java.util.ArrayList;

/**
 *
 * @author adrie
 */
public abstract class personnages {
    protected String nom;
    protected int niveauDeVie;
    public ArrayList <Armes> sacados  = new ArrayList();
    Armes armeEnMain = null;
    static public int nombrePersonnage = 0;

    public personnages(String nom, int niveauDeVie) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
        nombrePersonnage++;
    }

    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "personnages{" + "nom=" + nom + ", niveauDeVie=" + niveauDeVie + '}';
    }
    public void ajouterUneArme(Armes a){
        if (sacados.size()<6){
            sacados.add(a);
        }
    }

    public Armes getArmeEnMain() {
        return armeEnMain;
    }
    public void armeEquiper(int i){
    if (i>=0 && i<=sacados.size()-1){
        armeEnMain = sacados.get(i);
        System.out.println("Arme trouvée et en main !");
    }
    else{
        System.out.println("L'arme demandée n'existe pas ...");
    }
    }
    
    @Override
    public void finalize(){
        nombrePersonnage = nombrePersonnage - 1;
    }
    
}
