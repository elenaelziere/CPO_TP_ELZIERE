/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author elena
 */
public class Guerrier extends Personnage {
    boolean cheval;

    public Guerrier(String unNom, int unNv_Vie, boolean locomotion) {
        super(unNom, unNv_Vie);
        cheval = locomotion;
    }

    public boolean isCheval() {
        return cheval;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
   
   
    
@Override
public String toString() {
String chaine_a_retourner;
if (cheval == true){
   chaine_a_retourner = "Nom : " + nom + " \n" + "Niveau de vie : " + nv_Vie + "\n" + "Le guerrier est à cheval";
}else{
 chaine_a_retourner = "Nom : " + nom + " \n" + "Niveau de vie : " + nv_Vie + "\n" + "Le guerrier est à pied";   
}
   return chaine_a_retourner ;
}
        

}
