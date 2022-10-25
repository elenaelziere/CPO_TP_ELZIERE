package tp2_relation_1_elziere;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elena
 */
public class Personne {
    String nom;
    String prénom; 
    int nbVoitures; 
    Voiture [] liste_voitures;
    public void Infos() {
    System.out.println("Nom : " + nom +" /n " + "Prénom : "+ prénom ) ;
    }
    
public Personne(String unNom, String unPrénom){ 
   nom = unNom;
   prénom = unPrénom;
   liste_voitures = new Voiture [3];
   }     
    
    
@Override
public String toString() {
   String chaine_a_retourner;
   return = nom + prénom + "a" + nbVoitures + "voitures";
    } 

public boolean 


}
