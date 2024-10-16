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
    int nbConversion;
    
public int CelciusVersKelvin (int tCelcius){
        tCelcius = tCelcius+273;
        return tCelcius;
    }
    public int KelvinVersCelcius (int tKelvin){
        tKelvin = tKelvin-273;
        return tKelvin;
    }
    public int FarenheitVersCelcius (int tFarenheit){
        tFarenheit = (tFarenheit-32)*5/9;
        return tFarenheit;
    }
    public int CelciusVersFarenheit (int tCelcius){
        tCelcius = (tCelcius*9/5)+32;
        return tCelcius;
    }
    public int KelvinVersFarenheit (int tKelvin){
        tKelvin = ((tKelvin-273)*9/5)+32;
        return tKelvin;
    }
    public int FarenheitVersKelvin (int tFarenheit){
        tFarenheit = (tFarenheit-32)*5/9+273;
        return tFarenheit;
    }
}
