/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_elziere;

/**
 *
 * @author elena
 */
public class BouteilleBiere {//Affiche toutes les caractéristiques
    String nom;
    double degreAlcool; 
    String brasserie;
    boolean ouverte;  
    public void lireEtiquette() {
       System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;

   }
public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {// initialise les caractéristiques de la bière
   nom = unNom;
   degreAlcool = unDegre;
   brasserie = uneBrasserie;
   ouverte = false;
    }

 public boolean Décapsuler(){//teste si la bière est ouverte ou non
     if (ouverte==false) {
         ouverte=true;
        
     }
     else {
         
         ouverte=false;
     }
     return ouverte;
    }
     
 
@Override
public String toString() {//En fonction de si la biére est ouverte ou non, renvoie ouvert ou fermée
   String chaine_a_retourner;
   chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ; else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}
}
