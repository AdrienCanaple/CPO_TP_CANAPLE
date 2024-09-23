/*
 * Adrien CANAPLE
 * 23/09/2024
 * TP1 ex convertisseur
 */
package tp1_convertisseur_canaple;

import java.util.Scanner;

/**
 *
 * @author adrie
 */
public class TP1_convertisseur_CANAPLE {

    /**
     * @param args the command line arguments
     */
    public static double CelciusVersKelvin (double tCelcius){
        tCelcius = tCelcius+273;
        return tCelcius;
    }
    public static double KelvinVersCelcius (double tKelvin){
        tKelvin = tKelvin-273;
        return tKelvin;
    }
    public static double FarenheitVersCelcius (double tFarenheit){
        tFarenheit = (tFarenheit-32)*(5/9);
        return tFarenheit;
    }
    public static double CelciusVersFarenheit (double tCelcius){
        tCelcius = (tCelcius*9/5)+32;
        return tCelcius;
    }
    public static double KelvinVersFarenheit (double tKelvin){
        tKelvin = ((tKelvin-273)*9/5)+32;
        return tKelvin;
    }
    public static double FarenheitVersKelvin (double tFarenheit){
        tFarenheit = (tFarenheit-32)*(5/9)+273;
        return tFarenheit;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        double tCelcius = 0;
        double tKelvin = 0;
        Scanner sc = new Scanner(System.in);
        tCelcius = sc.nextDouble();
        tKelvin = CelciusVersKelvin(tCelcius);
        System.out.println(tKelvin);
    }
    
}
