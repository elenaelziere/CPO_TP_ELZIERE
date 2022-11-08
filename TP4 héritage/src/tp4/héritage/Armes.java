package tp4.héritage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elena
 */
public class Armes {
    String nom;
    int nvAttaque; 
    
public Armes(String unNom, int uneAttaque){
    nom = unNom;
    nvAttaque = uneAttaque;        
}

@Override
public String toString() {
String chaine_a_retourner;
   chaine_a_retourner = " Arme : " + nom + " \n" + "Niveau d'attaque : " + nvAttaque ;
return chaine_a_retourner ;
}


}