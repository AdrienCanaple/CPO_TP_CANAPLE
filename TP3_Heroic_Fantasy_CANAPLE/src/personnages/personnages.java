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
    ArrayList <Armes> sacados  = new ArrayList();

    public personnages(String nom, int niveauDeVie) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
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
}
