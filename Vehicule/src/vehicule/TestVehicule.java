/*
 *TestVehicule: ?
 */
package vehicule;

import java.util.Scanner;

/**
 *
 * @author stagiaire
 */
public class TestVehicule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final float TARIF_J = 30f;
        final float PRIX_KM = 1.25f;
        float km;
        int nbJours;
        
        Scanner lectureClavier = new Scanner(System.in);
        
        System.out.println("nombre de jours de location: ");
        nbJours = lectureClavier.nextInt();
        
        
        System.out.println("nombre de kilometres effectués: ");
        km = lectureClavier.nextFloat();
        
        float n1 = km * PRIX_KM;
        float n2 = nbJours * TARIF_J;
        
        System.out.println("le montant à payer est :" + (n1+n2) + " euros");
        
    }
    
}
