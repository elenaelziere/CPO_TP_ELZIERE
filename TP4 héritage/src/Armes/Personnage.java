/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author elena
 */
public class Personnage {
    String nom;
    int nv_Vie;
    
    public Personnage (String unNom, int unNv_Vie){
        nom = unNom;
        nv_Vie = unNv_Vie;
}

@Override
public String toString() {
String chaine_a_retourner;
   chaine_a_retourner = "Nom : " + nom + " \n" + "Niveau de vie : " + nv_Vie ;
return chaine_a_retourner ;
}
    
    
}
