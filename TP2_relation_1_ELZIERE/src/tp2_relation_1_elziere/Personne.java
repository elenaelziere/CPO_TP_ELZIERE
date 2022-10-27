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
   return nom +""+ prénom + "a" + nbVoitures + "voitures";
    } 

 public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
 if (voiture_a_ajouter.proprietaire!=null) {
     System.out.println( voiture_a_ajouter+ "déjà prise");
     return false;
 }
 else {
         if (this.nbVoitures==3){
         System.out.println(this.nom+this.prénom+"a déjà 3 voitures");
         return false;
         }
         else {
         this.liste_voitures[nbVoitures]=voiture_a_ajouter;
         nbVoitures +=1;
         voiture_a_ajouter.proprietaire=this;
                 return true;
         }
    }   
   }
 }
            
