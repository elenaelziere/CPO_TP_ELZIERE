/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4.héritage;

import Armes.Épée;
import Armes.Baton;
import Armes.Armes;
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
System.out.println(tab_Armes.get(taille-1));

}
}
