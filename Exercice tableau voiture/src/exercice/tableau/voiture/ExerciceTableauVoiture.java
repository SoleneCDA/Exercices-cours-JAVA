/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercice.tableau.voiture;

/**
 *
 * @author stagiaire
 */
public class ExerciceTableauVoiture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] tabVentes = {
            {0, 3, 2, 0},
            {2, 3, 0, 1},
            {1, 1, 1, 1},
            {5, 1, 0, 0},
            {1, 1, 2, 0}
        };
        String[] modeles = {"              twingo", "clio", "megane", "vel satis"};
        String[] vendeurs = {"André    ", "Ingemar    ", "Jean-Jérôme", "Cindy     ", "Joey    "};

        //Affichage du tableau
        System.out.print("\t");
        for (String unModele : modeles) {
            System.out.print(unModele + "\t");
        }
        System.out.println("");
        int i = 0;
        for (int[] uneLigne : tabVentes) {
            System.out.print(vendeurs[i] + "\t");
            for (int uneCellule : uneLigne) {
                System.out.print("\t" + uneCellule);
            }
            System.out.println("");
            i++;
        }

        // Q3: nombre d'exemplaires vendus pour chaque modele
        for (int i2 = 0; i2 < tabVentes[0].length; i2++) {
            int nbVentesModele = 0;
            for (int j = 0; j < tabVentes.length; j++) {
                nbVentesModele += tabVentes[j][i2];
            }
            System.out.println("Nombre de modele de " + modeles[i2] + " vendus : " + nbVentesModele);
        }

        // Q4: Calcul CA par vendeur
        float lesTarifs[] = {15000, 20000, 24000, 28000};
        System.out.println(""); // =tableau de tarifs
        i = 0;
        for (int[] uneLigne : tabVentes) {
            int caVendeur = 0;
            int j = 0;
            for (int uneCellule : uneLigne) {
                caVendeur += uneCellule * lesTarifs[j];
                j++;
            }
            System.out.println("CA du vendeur " + vendeurs[i] + " : " + caVendeur);
            i++;
        }

    }

}
