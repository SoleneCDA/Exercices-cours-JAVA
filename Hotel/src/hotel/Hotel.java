/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel;

import java.text.DecimalFormat;

/**
 *
 * @author stagiaire
 */
public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	// Déclaration des constantes et des variables
        final float PRIX_INITIAL            = 120f;
        final float TAUX_REDUCTION          = 0.01f;    	// Tx de réduction / jour pour les réservations avec + de 10j d'avance 
        final float TAUX_MAJORATION         = 0.02f;		// Tx de majoration / jour pour les réservations avec - de 5j d'avance
        double prixBase                     = PRIX_INITIAL; // Prix à afficher après calcul
        DecimalFormat df                    = new DecimalFormat("#0.00");
        // Pour afficher un nombre avec 2 décimales, utiliser le format df déclaré, 
		// Exemple : System.out.println("Prix de base : " + df.format(prixBase));
			
		// Début du programme
        System.out.println("*** Prix des chambres selon la date de réservation ***");
		
		// Faire 3 boucles for, 
		//		la première pour les réservations de j-0 à j-4
		//		le deuxième pour les réservations de j-5 à j-10
		//		la dernière pour les réservations de j-11 à j-30
		
        // 1ère boucle for : cas des 5 premiers jours
	
        for (int i=0; i<5; i++ ){
            double majoration=Math.pow(1+TAUX_MAJORATION, 5-i);
           System.out.println("Prix a (J- " + i + ") : " + df.format(PRIX_INITIAL * majoration )); 
        }
		
		        
        // 2ème boucle for : Cas d'une réservation avec 5 à 10 jours d'avance
        
		
	for (int i=5; i<11; i++) {
            System.out.println("Prix a (J- " + i + ") : " + PRIX_INITIAL);
        }
		
        
        // 3ème boucle for : Cas d'une réservation avec 11 à 30 jours d'avance
        prixBase=PRIX_INITIAL;
       
	for (int i=11;i<31;i++){
		prixBase = prixBase * (1-TAUX_REDUCTION);
                System.out.println("Prix a (J- " + i + ") : " + df.format(prixBase));
         }	
    }   
}
