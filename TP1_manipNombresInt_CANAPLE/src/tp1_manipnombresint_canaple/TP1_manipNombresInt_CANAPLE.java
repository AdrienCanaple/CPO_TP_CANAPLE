/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_canaple;
import java.util.Scanner;
/**
 *
 * @author adrie
 */
public class TP1_manipNombresInt_CANAPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int var1 = 0;
        int var2 = 0;
        int addition = 0;
        int soustraction = 0;
        int multiplication = 0;
        double division = 0;
        int quotent = 0;
        int reste = 0;
        Scanner sc = new Scanner (System.in);
        var1 = sc.nextInt();
        var2 = sc.nextInt();
        System.out.println("variable 1 = " + var1 + " et variable 2 = " + var2);
        addition = var1 + var2;
        soustraction =  var1 - var2;
        multiplication = var1*var2;
        division = var1/var2;
        quotent = var1/var2;
        reste = var1%var2;
        System.out.println("addition = "+addition+" soustraction = "+soustraction+" multiplication = "+multiplication+" division = "+division);
        
        
    }
    
}
