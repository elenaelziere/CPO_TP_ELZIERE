/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.héritage;

/**
 *
 * @author elena
 */
public class Baton extends Armes{
    int age;
    
    public Baton (String unNom, int uneAttaque, int unAge){
        super(unNom, uneAttaque);
        age = unAge;        
    }
}
