/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_elziere;

import java.util.Scanner;

/**
 *
 * @author elena
 */
public class TP2_convertisseurObjet_ELZIERE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner sc;
        sc = new Scanner(System.in);
       
        Convertisseur temperature = new Convertisseur();
       
        System.out.println("Entrez l'unité initiale de votre température:\n1 pour Farenheit \n2 pour Celcius\n3 pour Kelvin ");
        int entrée = sc.nextInt ();
       
        System.out.println("Entrez l'unité convertie :\n1 pour Farenheit \n2 pour Celcius\n3 pour Kelvin ");
        int sortie = sc.nextInt ();
       
        System.out.println("Entrez la valeur de votre température");
        int c = sc.nextInt ();
       
        
        if (entrée==2 && sortie==3){
        double result = temperature.CelciusVersKelvin (c);
        System.out.println(result+ " K");
        }
      
        if (entrée==3 && sortie==2){
        double result1 = temperature.KelvinVersCelcius (c);
        System.out.println(result1+ " °C");
        }
       
        if (entrée==1 && sortie==3){
        double result2 = temperature.FarenheitVersKelvin (c);
        System.out.println(result2+" K");
        }
       
        if (entrée==3 && sortie==1){
        double result3 = temperature.KelvinVersFarenheit (c);
        System.out.println(result3+" F");
        }
       
        if (entrée==2 && sortie==1){
        double result4 = temperature.CelciusVersFarenheit (c);
        System.out.println(result4+" F");
        }
       
        if (entrée==1 && sortie==2){
        double result5 = temperature.FarenheitVersCelcius (c);
        System.out.println(result5+" °C");
        }       
    }
}
 



