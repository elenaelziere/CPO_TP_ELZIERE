/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author elena
 */
public class Magicien extends Personnage {
    boolean confirmé;

    public Magicien(String unNom, int unNv_Vie, boolean niveau) {
        super(unNom, unNv_Vie);
        confirmé = niveau;
    }

    public boolean isConfirmé() {
        return confirmé;
    }

    public void setConfirmé(boolean confirmé) {
        this.confirmé = confirmé;
    }
    
@Override
public String toString() {
String chaine_a_retourner;
if (confirmé == true){
   chaine_a_retourner = "Nom : " + nom + " \n" + "Niveau de vie : " + nv_Vie + "\n" + "Le magicien est confirmé";
}else{
 chaine_a_retourner = "Nom : " + nom + " \n" + "Niveau de vie : " + nv_Vie + "\n" + "Le magicien est novice ";   
}
   return chaine_a_retourner ;
}
    
}
