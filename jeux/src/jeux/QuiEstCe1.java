/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jeux;

import java.util.Scanner;

/**
 *
 * @author stagiaire
 */
public class QuiEstCe1 {

    public static void main(String[] args) {
        // Déclaration des variables
        String perso = "";
        Scanner clavier = new Scanner(System.in);
        // Les  questions posées
        System.out.print("Pensez a un personnage : Mlle Rose, ");
        System.out.println("le Professeur Violet, le Colonel Moutarde,");
        System.out.println("le Reverend Olive ou Mme Leblanc.\n");

        System.out.print("Votre personnage a-t-il des moustaches ? ");
        System.out.print("(true : oui, false : non) ");
        boolean moustaches = clavier.nextBoolean();

        if (moustaches == true) {
            System.out.println("==> Le personnage auquel vous pensez est ");
            System.out.println("le Colonel Moutarde");
        } else {
            System.out.print("Votre personnage porte-t-il des lunettes ? ");

            boolean lunettes = clavier.nextBoolean();

            if (lunettes == false) {
                System.out.print("==> Le personnage auquel vous pensez est ");
                System.out.println("Mlle Rose");
            } else {
                System.out.print("Votre personnage porte-t-il un chapeau ? ");

                boolean chapeau = clavier.nextBoolean();

                if (chapeau == true) {
                    System.out.print("==> Le personnage auquel vous pensez est ");
                    System.out.println("le Professeur Violet");
                } else {
                    System.out.print("Est-ce que votre personnage est un homme ? ");

                    boolean homme = clavier.nextBoolean();

                    if (homme == false) {
                        System.out.print("==> Le personnage auquel vous pensez est ");
                        System.out.println("Mme Leblanc");
                    } else {
                        System.out.print("==> Le personnage auquel vous pensez est ");

                        System.out.println("le Reverend Olive");
                    }

                }
            }
        }
    }
}
