/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scrabble;
import java.util.Scanner;
/**
 *
 * @author stagiaire
 */
public class Scrabble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaration des variables
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Ecrire un mot: ");
        String mot = lectureClavier.nextLine(); // recuperation de la saisie
        int sommePoints = 0;
        int lgMot = mot.length();
        for (int i = 0; i < lgMot; i++) {
            char lettre = Character.toLowerCase(mot.charAt(i)); // Lettre en minuscule
            int points = 0; // Points initialisés à 0
            
            switch (lettre) {
                case 'a':
                case 'e':
                case 'i':
                case 'n':
                case 'o':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'l':
                    points = 1;
                    break;
                case 'd':
                case 'm':
                case 'g':
                    points = 2;
                    break;
                case 'b':
                case 'c':
                case 'p':
                    points = 3;
                    break;
                case 'f':
                case 'h':
                case 'v':
                    points = 4;
                    break;
                case 'j':
                case 'q':
                    points = 8;
                    break;
                case 'k':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    points = 10;
                    break;
            }

            sommePoints += points; // Ajouter les points de cette lettre à la somme totale
        }

        // Afficher la valeur totale en points du mot
        System.out.println("Le mot  \"" + mot + "\" a une valeur de : " + sommePoints);
    }
}
