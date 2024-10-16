/*
 *TP2 Exo convertisseur
 * Adrien CANAPLE
 * 15/10/2024
 */
package tp2_convertisseurobjet_canaple;

import java.util.Scanner;

/**
 *
 * @author adrie
 */
public class TP2_convertisseurObjet_CANAPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Convertisseur conv1 = new Convertisseur ();
        Scanner sc = new Scanner (System.in);
        //int val1 = sc.nextInt();
        //double resultat1 = conv1.CelciusVersFarenheit(val1);
        //System.out.println(resultat1);
        //int val2 = sc.nextInt();
        //double resultat2 = conv1.FarenheitVersKelvin(val2);
        //System.out.println(resultat2);
        
        //Convertisseur conv2 = new Convertisseur ();
        //int val3 = sc.nextInt();
        //double resultat3 = conv2.KelvinVersFarenheit(val3);
        //System.out.println(resultat3);
        //int val4 = sc.nextInt();
        //double resultat4 = conv2.CelciusVersKelvin(val4);
        //System.out.println(resultat4);
        
        
        
        
        Convertisseur conv3=new Convertisseur();

        double val5;
        int conv;
        
         System.out.println("Saisir la conversion");

         System.out.println("1) De Celcius vers Kelvin");

         System.out.println("2) Kelvin Vers Celcius");

         System.out.println("3) Farenheit Vers Celcius");

         System.out.println("4) Celcius Vers Farenheit");

         System.out.println("5) Kelvin Vers Farenheit");

         System.out.println("6) De Farenheit vers Kelvin");

         conv = sc.nextInt();

         System.out.println("Saisir la valeur que vous souhaiter convertir");

         val5 = sc.nextDouble();

         if (conv==1){

             System.out.println(""+val5+" degres celcius est egal a "+conv3.CelciusVersKelvin(val5)+" degres Kelvin");

         }

         else if (conv==2){

             

             System.out.println(""+val5+" degres Kelvin est egal a "+conv3.KelvinVersCelcius(val5)+" degres celcius");

         }

         else if (conv==3){

             

             System.out.println(""+val5+" degres Farenheit est egal a "+conv3.FarenheitVersCelcius(val5)+" degres celcius");

         }

         else if (conv==4){

             

             System.out.println(""+val5+" degres Celcius est egal a "+conv3.CelciusVersFarenheit(val5)+" degres Farenheit");

         }

         else if (conv==5){

             

             System.out.println(""+val5+" degres Kelvin est egal a "+conv3.KelvinVersFarenheit(val5)+" degres Farenheit");

         }

         else if (conv==6){

             

             System.out.println(""+val5+" degres Farenheit est egal a "+conv3.FarenheitVersKelvin(val5)+" degres Kelvin");

         }

         System.out.println(conv3);

    }

    }
