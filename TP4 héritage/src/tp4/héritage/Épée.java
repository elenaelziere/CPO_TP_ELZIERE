/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.héritage;

/**
 *
 * @author elena
 */
public class Épée extends Armes{
    int finesse; 
    
    public Épée (String unNom, int uneAttaque, int uneFinesse){
        super(unNom, uneAttaque);
        if (uneFinesse > 0) {
            finesse = uneFinesse; 
        } else { 
            finesse = 0;
        } if (uneFinesse <= 100)
            finesse = 100;
    }

@Override
public String toString() {
String chaine_a_retourner;
   chaine_a_retourner = " Épée : " + nom + " \n" + "Niveau d'attaque : " + nvAttaque + "\n" + "Finesse : " + finesse;
return chaine_a_retourner ;
}



}
