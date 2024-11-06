/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_canaple;

/**
 *
 * @author adrie
 */
public class Baton extends Armes{
    int age;

    public Baton(int age, String nom, int niveauAttaque) {
        super(nom, niveauAttaque);
        if (age<=100 & age >=0){
        this.age = age;
        }
        else{
            this.age = 10;
    }
    }
    
    
}
