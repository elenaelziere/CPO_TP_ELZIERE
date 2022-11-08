/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.héritage;

/**
 *
 * @author elena
 */
public class Baton extends Armes {

    int age;

    public Baton(String unNom, int uneAttaque, int unAge) {
        super(unNom, uneAttaque);
        if (unAge > 0) {
            age = unAge;
        } else {
            age = 0;
        }
        

    }

    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Baton : " + nom + " \n" + "Niveau d'attaque : " + nvAttaque + "\n" + "Âge : " + age;
        return chaine_a_retourner;

    }
}
