/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_canaple;

import personnages.personnages;
import personnages.Magicien;
import personnages.Guerrier;
import Armess.Baton;
import Armess.Epee;
import Armess.Armes;
import java.util.ArrayList;

/**
 *
 * @author adrie
 */
public class TP3_Heroic_Fantasy_CANAPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Epee Excalibur = new Epee ("Excalibur",7,5);
        Epee Durandal = new Epee("Durandal",4,7);
        
        Baton Chêne = new Baton ("Chêne", 4 , 5);
        Baton Charme = new Baton("Charme", 5,6);
        
        ArrayList <Armes> weapon = new ArrayList();
        weapon.add(Excalibur);
        weapon.add(Durandal);
        weapon.add(Chêne);
        weapon.add(Charme);
        
        int taille = weapon.size();
        String affichage = "";
        for(int i = 0;i<taille;i++){
            affichage = affichage + weapon.get(i)+"\n";
        }
        System.out.println(affichage);
        
        Magicien Gandalf = new Magicien("Gandalf",65,true);
        Magicien Garcimore = new Magicien ("Garcimore", 44,false);
        
        Guerrier Conan = new Guerrier ("Conan",78,false);
        Guerrier Lannister = new Guerrier("Lannister",45,true);
        
        ArrayList <personnages> Personnages = new ArrayList ();
        Personnages.add(Gandalf);
        Personnages.add(Garcimore);
        Personnages.add(Conan);
        Personnages.add(Lannister);
        
        int taille2 = Personnages.size();
        String affichage2 ="";
        for(int i = 0; i<taille2; i++){
            affichage2 = affichage2 + Personnages.get(i)+"\n";
        }
        System.out.println(affichage2);
    }
    
}
