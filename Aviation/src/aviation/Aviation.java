/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aviation;

/**
 *
 * @author stagiaire
 */
public class Aviation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Avion monAvion = new Avion();
        System.out.println("Vitesse max: " + monAvion.getVITESSE_MAX());
        System.out.println("Altitude max: " + monAvion.getALTITUDE_MAX());
        monAvion.ajouterPassager(20);
        System.out.println("Nb passager: " + monAvion.getNbPassagers());

        if (monAvion.ajouterPassager(50)) {
            System.out.println("50 passagers ajoutés ");
        } else {
            System.out.println("Pas assez de place");
        }
        System.out.println("nombre max de passagers: " + monAvion.getCAPACITE_PASAGER());

        
        
        System.out.println("caracteristiques: " + monAvion.getCaracteristiques());
        
        
        
        if ((monAvion.getVitesse() == 0) || (monAvion.getAltitude() == 0)) {
            System.out.println("au sol");
        } else {
            System.out.println("en vol");
        }
        
        
        monAvion.decoller();
        System.out.println("caracteristiques: " + monAvion.getCaracteristiques()); 
        
        System.out.println("Vitesse: " + monAvion.getVitesse() + "  Altitude: " + monAvion.getAltitude());
        monAvion.accelerer(100);
        monAvion.monter(2000);
        System.out.println("Vitesse: " + monAvion.getVitesse() + "  Altitude: " + monAvion.getAltitude());
        
        monAvion.atterrir();
        System.out.println("caracteristiques: " + monAvion.getCaracteristiques()); 
    }
}




