package labo;

public class Souris {
    // Déclaration et initialisation constante

    private static final int ESPERANCE_VIE_DEFAUT = 36;

    /**
     * @return the ESPERANCE_VIE_DEFAUT
     */
    public static int getESPERANCE_VIE_DEFAUT() {
        return ESPERANCE_VIE_DEFAUT;
    }

    // Variables membres
    private int poids;
    private String couleur;
    private int age = 0;
    private int esperanceVie;
    private boolean clonee;

    /**
     * Constructeur1
     *
     * @param pds : poids
     * @param c : couleur
     * @param a : age
     * @param ev : espérance de vie
     */
    public Souris(int pds, String c, int a, int ev) {
        poids = pds;
        couleur = c;
        age = a;
        esperanceVie = ev;
        clonee = false;
        System.out.println("Une nouvelle souris !");
    }

    /**
     * Constructeur2 : espérance de vie par défaut
     *
     * @param pds : poids
     * @param c : couleur
     * @param a : age
     */
    public Souris(int pds, String c, int a) {
        this(pds, c, a, ESPERANCE_VIE_DEFAUT);
    }

    /**
     * Constructeur3 : age et espérance de vie par défaut
     *
     * @param pds : poids
     * @param c : couleur
     */
    public Souris(int pds, String c) {
        this(pds, c, 0, ESPERANCE_VIE_DEFAUT);
    }

    /**
     * Constructeur de copie (clone)
     *
     * @param s : souris à cloner
     */
    public Souris(Souris s) {
        poids = s.poids;
        couleur = s.couleur;
        age = s.age;
        esperanceVie = (s.esperanceVie) * 4 / 5;
        clonee = true;
        System.out.println("Clonage d'une souris !");
    }

    /**
     * Caractéristiques de la souris
     *
     * @return chaine de caractères avec toutes les caractéristiques
     */
    public String getCaracteristiques() {
        String cl = (isClonee()) ? ", clonee," : "";
        return "Une souris " + getCouleur() + cl + " de " + getAge() + " mois et pesant " + getPoids() + " grammes";
    }

    /**
     * Comparaison de la souris courant avec la souris passée en paramètre 2
     * souris sont considérées comme identiques si elles ont même poids, même
     * âge et même couleur
     *
     * @param s souris à comparer
     * @return true si les 2 souris sont identiques, false sinon
     */
    public boolean equals(Souris s) {
        boolean egalite = true;
        if (s == null) {
            egalite = false;
        } else {
            if ((getPoids() != s.getPoids())
                    || (getAge() != s.getAge())
                    || (!(couleur.equals(s.couleur)))) {
                egalite = false;

            }
        }
        return egalite;
    }

    /**
     * Fait vieillir la souris de 1 annnée
     */
    public void vieillir() {
        age++;
        if (isClonee()) {
            if (getAge() > getEsperenceVie() / 2) {
                couleur = "verte";
            }
            if (getCouleur().equals("verte")) {
                poids = (int) Math.round(getPoids() * 0.9);
            }
        }
    }

    /**
     * Fait vieillir la souris jusqu'à son espérance de vie
     */
    public void evolue() {
        for (int i = getAge(); i < getEsperenceVie(); i++) {
            vieillir();
        }
    }

    /**
     * @return the poids
     */
    public int getPoids() {
        return poids;
    }

    /**
     * @return the couleur
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the esperanceVie
     */
    public int getEsperenceVie() {
        return esperanceVie;
    }

    /**
     * @return the clonee
     */
    public boolean isClonee() {
        return clonee;
    }

    public boolean comparer(Souris s) {
        boolean egalite = true;

        if (s == null) {
        egalite = false;
        }
        else {
           
        if (getPoids() != s.getPoids()) {
            egalite = false;
            System.out.println("le poids est différent");
        }
        if (getAge() != s.getAge()) {
            egalite = false;
            System.out.println("l'age est différent");
        }
        if (!(couleur.equals(s.couleur))) {
            egalite = false;
            System.out.println("La couleur est différente");
        }
        if (egalite){
            System.out.println("les souris sont identiques");
        }
    }

    return egalite ;
}
}
