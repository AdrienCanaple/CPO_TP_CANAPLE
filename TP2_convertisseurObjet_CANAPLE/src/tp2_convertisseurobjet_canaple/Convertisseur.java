/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_canaple;

/**
 *
 * @author adrie
 */
public class Convertisseur {
    int nbConversion = 0;

    public Convertisseur() {
    }
public double CelciusVersKelvin (double tCelcius){
        tCelcius = tCelcius+273;
        return tCelcius;
    }
    public double KelvinVersCelcius (double tKelvin){
        tKelvin = tKelvin-273;
        return tKelvin;
    }
    public double FarenheitVersCelcius (double tFarenheit){
        tFarenheit = (tFarenheit-32)*5/9;
        return tFarenheit;
    }
    public double CelciusVersFarenheit (double tCelcius){
        tCelcius = (tCelcius*9/5)+32;
        return tCelcius;
    }
    public double KelvinVersFarenheit (double tKelvin){
        tKelvin = ((tKelvin-273)*9/5)+32;
        return tKelvin;
    }
    public double FarenheitVersKelvin (double tFarenheit){
        tFarenheit = (tFarenheit-32)*5/9+273;
        return tFarenheit;
    }

    @Override
    public String toString() {
        return "Convertisseur{" + "nbConversion=" + nbConversion + '}';
    }
}