package aviation;

public class Avion {
	// Variables membres
    private int VITESSE_MAX = 500;
    private int ALTITUDE_MAX = 4000;
    private int CAPACITE_PASSAGER = 100;
    private int vitesse;
    private int altitude;
    private int nbPassagers;

    /**
     * @return the VITESSE_MAX
     */
    public int getVITESSE_MAX() {
        return VITESSE_MAX;
    }

    /**
     * @return the ALTITUDE_MAX
     */
    public int getALTITUDE_MAX() {
        return ALTITUDE_MAX;
    }

    /**
     * @return the CAPACITE_PASSAGER
     */
    public int getCAPACITE_PASAGER() {
        return CAPACITE_PASSAGER;
    }

    /**
     * @return the vitesse
     */
    public int getVitesse() {
        return vitesse;
    }

    /**
     * @param vitesse the vitesse to set
     */
    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    /**
     * @return the altitude
     */
    public int getAltitude() {
        return altitude;
    }

    /**
     * @param altitude the altitude to set
     */
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    /**
     * @return the nbPassagers
     */
    public int getNbPassagers() {
        return nbPassagers;
    }

    /**
     * @param nbPassagers the nbPassagers to set
     */
    public void setNbPassagers(int nbPassagers) {
        this.nbPassagers = nbPassagers;
    }
    /**
     * Ajoute le nb de km passé en paramètre à la vitesse actuelle
     *      si l'avion n'est pas au sol et 
     *      si la vitesse maximale ne sera pas dépassée
     * @param km 
     */
    public void accelerer(int km) {
        if (vitesse != 0 && vitesse+km<=VITESSE_MAX) {
            vitesse +=km;
        }
    }
    
    /**
     * Ote le nb de km passé en paramètre à la vitesse actuelle
     *      si l'avion n'est pas au sol et 
     *      si la vitesse ne sera pas négative
     * @param km 
     */
    public void ralentir(int km) {
        if (vitesse > 0 && vitesse-km >= 0) {
            vitesse -= km;
        }
    }
    /**
     * Ajoute le nb de m passé en paramètre à l'altitude actuelle
     *      si l'avion n'est pas au sol et 
     *      si l'altitude maximale ne sera pas dépassée
     * @param m 
     */
    public void monter(int m) {
        if(altitude > 0 && altitude+m <= ALTITUDE_MAX) {
            altitude += m;
        }
    }
    
    /**
     * Ote le nb de m passé en paramètre à l'altitude actuelle
     *      si l'avion n'est pas au sol et 
     *      si l'altitude ne sera pas négative
     * @param m 
     */
    public void descendre(int m) {
        if(altitude>0 && altitude-m >=0) {
            altitude -= m;
        }
    }
    
    /**
     * Décollage possible si l'avion est au sol
     * altitude atteinte : 500m, vitesse : 300 km
     */
    public void decoller() {
        if (altitude == 0 && vitesse == 0) {
            altitude = 500;
            vitesse = 300;
        }
    }
    
    /**
     * Atterrisage
     */
    public void atterrir() {
        altitude = 0;
        vitesse = 0;
    }
    /**
     * Ajoute le nombre de passagers passés en paramètres au nombre actuel
     * Si l'avion est au sol et s'il reste de la place
     * @param nb nombre de passagers à ajouter
     * @return true si l'ajout s'est bien passé, false sinon
     */
    public boolean ajouterPassager(int nb) {
        boolean ajoutOK = false;
        if (nbPassagers+nb < CAPACITE_PASSAGER && vitesse == 0 && altitude == 0) {
            nbPassagers += nb;
            ajoutOK = true;
        }
        return ajoutOK;
    }
    
    /**
     * Caractéristiques actuelles de l'avion
     * @return vitesse, altitude et nb passagers
     */
    public String getCaracteristiques() {
        return  "Vitesse : " + vitesse + 
                "\tAltitude : "+ altitude + 
                "\tNb passagers : " + nbPassagers;
    }  
}