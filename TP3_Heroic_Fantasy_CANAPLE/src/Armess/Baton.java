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
public class Baton extends Armes{
    int age;

    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        if (age<100 & age >=0){
        this.age = age;
        }
        else{
            this.age = 10;
    }
    }

    @Override
    public String toString() {
        return "Baton{" + " Nom = "+ nom + ", niveau attaque = "+ niveauAttaque+ ", age=" + age + '}';
    }
    
    
}
