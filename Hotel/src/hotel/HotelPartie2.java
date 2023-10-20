/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author stagiaire
 */
public class HotelPartie2 {

    /* Hotel - Partie2
 * Yield Management pour le prix des chambres d' un hôtel
 * Prix proposé selon :
		la date de réservation, le taux de remplissage, la présence d'un évènement et le jour de la semaine
     */
    public static void main(String[] args) {
        final float PRIX_INITIAL = 120f;
        final float TAUX_REDUCTION = 0.01f;	// Tx de réduction / jour pour les réservations avec + de 10j d'avance 
        final float TAUX_REDUCTION2 = 0.10f; 	// tx de réduction pour les 5 derniers jours si le tx de remplissage est < 80%
        final float TAUX_MAJORATION = 0.02f;	// Tx de majoration / jour pour les réservations avec - de 5j d'avance
        final float TAUX_MAJORATION_EVT = 0.10f;	// Tx de majoration s'il y a un événement le jour du séjour
        final float TAUX_MINORATION_WE = 0.20f;	// Tx de réduction pour les séjours du WE, sauf événement
        float tauxRemplissage;							// tx de remplissage, à demander si réservation avec moins de 5 jours d'avance
        double prixBase = PRIX_INITIAL;
        double prix;									// Prix à afficher après toute modification
        int nbJours, jourSemaine;						// nbJours : nb jours avant séjour, jourSemaine : no du jour de la semaine (0 : dimanche, ..., 7 : samedi)
        boolean evt;									// Présence d'un événement le jour du séjour, true si oui, false si non
        Scanner lectureClavier = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        // Pour afficher un nombre avec 2 décimales, utiliser le format df déclaré, 
        // Exemple : System.out.println("Prix de base : " + df.format(prixBase));
        /**
         * ************************************************************************
         * A - Calcul du prix de base en fonction du nombre de jours avant
         * séjour
         * **************************************************************************
         *
         *
         *
         *
         * /* Saisie du nombre de jours avant le séjour Controler que ce nombre
         * soit compris entre 0 et 30
         */
        int nb;
        do {
            System.out.println("Nombre de jours avant le séjour (0 - 30) ? ");
            nb = lectureClavier.nextInt();
            if (nb < 0 || nb > 30) {
                System.out.println("Nombre de jours non valide");
            }
        } while (nb <= 0 || nb > 30);

        // Calcul du prix de base selon nbJours saisi et le taux de remplissage si nbJours < 5
        

        if ((nb >= 11) && (nb < 31)) {
            prixBase = PRIX_INITIAL * Math.pow(1 - TAUX_REDUCTION, nb - 10);
            System.out.println("Prix a (J- " + nb + ") : " + df.format(prixBase));
        }

        if ((nb >= 5) && (nb < 11)) {
            System.out.println("Prix a (J- " + nb + ") : " + df.format(prixBase));
        }

        float tx;
        if ((nb >= 0) && (nb < 5)) {
            do {
                System.out.println("Taux de remplissage (0 - 99)? ? ");
                tx = lectureClavier.nextInt();
                if (tx < 0 || tx > 99) {
                    System.out.println("taux non valide");
                }
            } while (tx <= 0 || tx > 99);
            if (tx > 80) {
                prixBase = PRIX_INITIAL * Math.pow(1 + TAUX_MAJORATION, 5 - nb);
                System.out.println("Prix a (J- " + nb + ") : " + df.format(prixBase) ); 
            }
            else {
                prixBase = PRIX_INITIAL * Math.pow(1 - TAUX_REDUCTION2, 5 - nb);
                System.out.println("Prix a (J- " + nb + ") : " + df.format(prixBase) ); 
            }
        }
        /**
         * ***********************************************************************
         * B - Gestion des événements
         * ************************************************************************
         */
        // Saisie événement
      String event;
           do {
            System.out.println("Est-ce qu'il y a un événement le jour du séjour (true, false) ? ");
            event = lectureClavier.next();
           } while (!"true".equals(event) && !"false".equals(event));
            
             // Majoration du prix si événement
            if ("true".equals(event)) {
                prix = prixBase * (1 + TAUX_MAJORATION_EVT );
            } else {
                prix = prixBase;
            
            
        System.out.println("Tarif lors d'événement: " + df.format(prix));


        /**
         * ***********************************************************************
         * C - Gestion des week-end
         * ************************************************************************
         */
        // Saisie jour de la semaine si pas d'événement
        
        do {
            System.out.println("Quel est le jour du séjour (0: dimache,..., 6:samedi) ? ");
            jourSemaine = lectureClavier.nextInt();
            if (jourSemaine < 0 || jourSemaine >6) {
                System.out.println("Jours non valide");
            }
        } while (jourSemaine < 0 || jourSemaine > 6);
        
        
        
        // Diminution du prix si WE sans événement et affichage du nouveau prix
        
        if ((jourSemaine == 0) || (jourSemaine>=5)){
            prix= prixBase * (1 - TAUX_MINORATION_WE);
        } else {
            prix = prixBase;
        }
            }
         System.out.println("Prix : " + df.format(prix));
    }} 

