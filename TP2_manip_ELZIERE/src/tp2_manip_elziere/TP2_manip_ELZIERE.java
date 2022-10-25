/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_elziere;

/**
 *
 * @author elena
 */
public class TP2_manip_ELZIERE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Tartiflette assiette1 = new Tartiflette(500) ;//nombre de calories de l'assiette 1
    Tartiflette assiette2 = new Tartiflette(600) ; //nombre de calories de l'assiette 2
    assiette2.nbCalories = 400;
    Tartiflette assiette3 = assiette2 ;//assignation de la valeur de l'assiette 2 à 3
    
    System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
    System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
    
    assiette2 = assiette1;//échange de la valeur de lassiette 2 et 1
    assiette1 = assiette3;
    
    Moussaka [] tableau = new Moussaka[10];
    for (int i=0 ; i<tableau.length ; i++){
    tableau[i] = new Moussaka(100*(1+i));
    if (i==tableau.length-1){
        System.out.println(tableau[i]);   
        }
    else{
        System.out.println(tableau[i]);
        }
    }
}

}