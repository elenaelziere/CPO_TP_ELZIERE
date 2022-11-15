/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Armes;
import java.util.ArrayList;

/**
 *
 * @author elena
 */
public class Personnage {
    String nom;
    int nv_Vie;
    ArrayList <Armes> tab = new ArrayList<Armes>();
    Armes arme_en_main;
    
    
    public Personnage (String unNom, int unNv_Vie){
        nom = unNom;
        nv_Vie = unNv_Vie;
        arme_en_main = null;
    }

    public void ajouter_armes (Armes arme_a_ajouter){
        if (tab.size()<5){
            tab.add(arme_a_ajouter);
        }
    }
  public Armes getarme_en_main () {
      return arme_en_main;
  }
  
  public void equipement (String équiper){
  for (int i=0; i<tab.size();i++){
      if (tab.get(1).getNom().equals(équiper)){
          System.out.println("Arme équipée");
      }
     }
  }
  
    
  
@Override
public String toString() {
String chaine_a_retourner;
if (arme_en_main != null){
   chaine_a_retourner = "Nom : " + nom + " \n" + "Niveau de vie : " + nv_Vie + "\n" + "Arme : " + arme_en_main ;
}else{
   chaine_a_retourner = "Nom : " + nom + " \n" + "Niveau de vie : " + nv_Vie;
}
 return chaine_a_retourner ;
}
    
    
}
