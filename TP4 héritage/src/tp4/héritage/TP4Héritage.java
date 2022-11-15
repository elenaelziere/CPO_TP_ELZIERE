/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4.héritage;

import Armes.*;
import Personnages.*;
import java.util.ArrayList;


/**
 *
 * @author elena
 */
public class TP4Héritage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    
    Épée Épée1 = new Épée("Excalibur",7,5);
        System.out.println(Épée1);
    Épée Épée2 = new Épée("Durandal",4,7);
        System.out.println(Épée2);
        
    Baton Baton1 = new Baton("Chêne",4,5);
        System.out.println(Baton1);
    Baton Baton2 = new Baton("Charme",5,6);
        System.out.println(Baton2);
   
ArrayList <Armes> tab_Armes = new ArrayList <Armes>();  
tab_Armes.add(Épée1);    
tab_Armes.add(Épée2);     
tab_Armes.add(Baton1);     
tab_Armes.add(Baton2); 

int taille = tab_Armes.size();
int longueur = taille-1;
for (int i = 0; i<longueur; i++) {
    System.out.print(tab_Armes.get(i)+",");

}

   

Magicien Magicien1 = new Magicien("Gandalf",65,true);
        System.out.println(Magicien1);
Magicien Magicien2 = new Magicien("Garcimore",44,false);
        System.out.println(Magicien2);
        
Guerrier Guerrier1 = new Guerrier("Conan",78,false);
        System.out.println(Guerrier1);
Guerrier Guerrier2 = new Guerrier("Lannister",45,true);
        System.out.println(Guerrier2);
        
ArrayList <Personnage> tab_Persos = new ArrayList <Personnage>();  
tab_Persos.add(Magicien1);    
tab_Persos.add(Magicien2);     
tab_Persos.add(Guerrier1);     
tab_Persos.add(Guerrier2);  

int taille2 = tab_Persos.size();
int longueur2 = taille2-1;
for (int i = 0; i<longueur2; i++) {
    System.out.print(tab_Persos.get(i)+",");

}
System.out.println(tab_Armes.get(taille-1));
System.out.println(tab_Persos.get(taille2-1));
    
Guerrier Guerrier3 = new Guerrier("John",76,true);
Magicien Magicien3 = new Magicien("Gargamel",51,false);
Baton Baton3 = new Baton("Bûche",7,6);
Baton Baton4 = new Baton("Branche",9,5);
Baton Baton5 = new Baton("Pin",5,7);
Épée Épée3 = new Épée("Lame",4,2);
Épée Épée4 = new Épée("Dague",8,5);
Épée Épée5 = new Épée("Poignard",7,3);
       


    }
    }
