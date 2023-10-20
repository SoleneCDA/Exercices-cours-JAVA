
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author stagiaire
 */
public class ExoFonctions2 {

    public static void main(String[] args) {

        final int NB_ESSAIS_MAX = 3;
        final int BORNE_SUP = 30;
        final int NOMBRE_CHERCHE = choisirUnNombreAuHasard(BORNE_SUP);
        int nbEssais = 1;
        boolean trouve = false;
        System.out.println("*** Jeu des nombres ***");
        System.out.println("Le nombre à trouver est entre 0 et " + BORNE_SUP);
        while (nbEssais <= NB_ESSAIS_MAX && !trouve) {
            System.out.print("Essai n°" + nbEssais);
            int proposition = saisirUnNombre(BORNE_SUP);
            String message = switch (comparer(proposition, NOMBRE_CHERCHE)) {
                case -1 -> {
                    yield "Ce n'est pas ce nombre, "
                    + "le nombre à trouver est plus grand";
                }
                case 0 -> {
                    trouve = true;
                    yield "Félicitations, vous avez trouvé! ";
                }
                case 1 -> {
                    yield "Ce n'est pas ce nombre, "
                    + "le nombre à trouver est plus petit";
                }
                default -> {
                    yield "";
                }
            };
            System.out.println(message);
            if (!trouve) {
                nbEssais++;
            }
        }
        if (!trouve) {
            System.out.println("Vous avez perdu, le nombre à trouver était "
                    + NOMBRE_CHERCHE);
        } else {
            System.out.println("Vous avez trouvé en seulement "
                    + nbEssais + " essai(s)!");
        }
    }

    /**
     * détermine un nombre aléatoire entre 0 et valMax
     *
     * @param valMax valeur maximale du nombre aléatoire
     * @return le nombre aléatoire
     */
    static int choisirUnNombreAuHasard(int valMax) {
        return (int) (Math.random() * valMax);
    }

    static int comparer(int n1, int n2) {
        int result;
        if (n1 > n2) {
            result = 1;
        } else {
            result = n1 < n2 ? -1 : 0;
        }
        return result;
    }

    static int saisirUnNombre(int valMax) {
        int saisie;
        boolean saisieOK;
        Scanner lc = new Scanner(System.in);
        do {
            System.out.println("\t Indiquez un nombre entre 0 et " + valMax);
            saisie = Integer.parseInt(lc.nextLine());
            saisieOK = (saisie >= 0 && saisie <= valMax);
        } while (!saisieOK);
        return saisie;
    }

}
