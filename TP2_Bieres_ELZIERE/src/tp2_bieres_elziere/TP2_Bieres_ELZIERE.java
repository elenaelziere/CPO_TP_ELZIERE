/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_elziere;

/**
 *
 * @author elena
 */
public class TP2_Bieres_ELZIERE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // déclaration du nom, degré et brasserie des bières
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson");
        uneBiere.lireEtiquette();//affiche les caractéristiques de la bière
        uneBiere.Décapsuler();// test si la bière est ouverte ou non
        System.out.println(uneBiere);// afficher tout
        
        BouteilleBiere Biere2 = new BouteilleBiere("Heineken", 6.5 ,"Dubuisson") ;
        Biere2.lireEtiquette();
        Biere2.Décapsuler();
        System.out.println(Biere2);
        
        BouteilleBiere Biere3 = new BouteilleBiere("Desperados",5.9 ,"Dubuisson") ;
        Biere3.lireEtiquette();
        Biere3.Décapsuler();
        System.out.println(Biere3);
        
        
        
        // TODO code application logic here
    }
    
}
