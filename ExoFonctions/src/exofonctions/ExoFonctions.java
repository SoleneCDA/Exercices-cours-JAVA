
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author stagiaire
 */
public class ExoFonctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calcul du perimetre d'un rectangle");
        
        int longueur, largeur, perimetre;
        Scanner lc = new Scanner (System.in);
        
        // Saisies longueur et largeur
        
        System.out.println("Longueur: ");
        longueur= lc.nextInt();
        System.out.println("Largeur: ");
        largeur = lc.nextInt();
        
        // appel à la fonction de calcul
        
        perimetre = calculerPerimetre(longueur, largeur);
        System.out.println("Perimetre du rectangle : " + perimetre);
    }
     
    /**
     * Calcul du perimetre d'un rectangle
     * @param lng longueur
     * @param irg largeur
     * @return perimetre calculé
     */
    static int calculerPerimetre (int lng, int lrg){
        return (lng + lrg) *2;
    }
    
}
