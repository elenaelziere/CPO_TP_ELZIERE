/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.héritage;

/**
 *
 * @author elena
 */
public class Épée extends Armes{
    int finesse; 
    
    public Épée (String unNom, int uneAttaque, int uneFinesse){
        super(unNom, uneAttaque);
        finesse = uneFinesse;
    }
}
