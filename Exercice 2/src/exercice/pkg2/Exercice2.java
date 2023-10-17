/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercice.pkg2;


/**
 *
 * @author stagiaire
 */
public class Exercice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      

        int[] tabEntiers = {10, 24, 55, 64, 98, 87, 42, 37, 14, 2, 45, 88, 79, 33, 26, 6, 44, 59, 92, 30};
        int nbMin = tabEntiers[0];
        int nbMax = tabEntiers[0];
        int indMax = 0;
        int indMin = 0;

        for (int i= 1; i < tabEntiers.length; i++) {
            if (tabEntiers[i] < nbMin) {
                nbMin = tabEntiers[i];
                indMin = i;
            }
            if (tabEntiers[i] > nbMax){
                nbMax = tabEntiers[i];
                indMax = i;
            }
        }
        System.out.println("la valeur la plus faible est :" + nbMin +"et est a la position: " + indMin);
        System.out.println("la valeur la plus grand est :" + nbMax +"et est a la position: " +indMax);
    }

}
