/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_canaple;

/**
 *
 * @author adrie
 */
public class Epee extends Armes {
    int finesse;

    public Epee(int finesse, String nom, int niveauAttaque) {
        super(nom, niveauAttaque);
        if (finesse <=100 & finesse >=0){
        this.finesse = finesse;
        }
        else{
            this.finesse = 10;
        }
    }
    
}
