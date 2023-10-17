/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercice.pkg1;

import java.util.Scanner;

/**
 *
 * @author stagiaire
 */
public class Exercice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lectureClavier = new Scanner(System.in);
        int nbRecherche;
        int[] entiers = {10, 24, 55, 64, 98, 87, 42, 37, 14, 2};
        System.out.println("Entrer un entier: ");
        nbRecherche = lectureClavier.nextInt();

        boolean trouve = false;
        int i = 0;

        while (trouve == false && i < entiers.length) {
            if (entiers[i] == nbRecherche) {
                trouve = true;
            } else {
                i++;
            }}
            
            if (trouve) {
                System.out.println("trouvé a la position: " +i);
            } else {
                System.out.println("essaye encore");
            }
        }}