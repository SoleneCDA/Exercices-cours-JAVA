/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import java.util.Objects;

/**
 *
 * @author domin
 */
public class Monnaie {
    String libelle;
    String abreviation;

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public Monnaie(String libelle, String abreviation) {
        this.libelle = libelle;
        this.abreviation = abreviation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.libelle);
        hash = 17 * hash + Objects.hashCode(this.abreviation);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Monnaie other = (Monnaie) obj;
        if (!Objects.equals(this.libelle, other.libelle)) {
            return false;
        }
        return Objects.equals(this.abreviation, other.abreviation);
    }

    @Override
    public String toString() {
        return "Monnaie{" + "libelle=" + libelle + ", abreviation=" + abreviation + '}';
    }
    
    
    
}
