package tp2_relation_1_elziere;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elena
 */
public class Voiture {
    String modèle;
    String marque;
    int puissance; 
    public void Caractéristiques() {
    System.out.println("Modèle : " +modèle + "/n"+ " Marque : " + marque + "/n" + "Puissance Cv : " + puissance ) ;
    }
    
public Voiture(String unModèle, String uneMarque, int unePuissance){ //
   modèle = unModèle;
   marque = uneMarque;
   puissance = unePuissance;
   }

@Override
public String toString() {
   String chaine_a_retourner;
   chaine_a_retourner = modèle +" de chez" + marque +"avec une puissance de"+ puissance + "( en CV) ";

}    

}
