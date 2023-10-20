/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import java.util.ArrayList;

/**
 *
 * @author domin
 */
public class MonnaiesGerees {
    ArrayList <Monnaie> lesMonnaies;

    public ArrayList<Monnaie> getLesMonnaies() {
        return lesMonnaies;
    }

    public MonnaiesGerees() {
        lesMonnaies = new ArrayList();
        Monnaie uneMonnaie = new Monnaie("Euro", "EUR");
        lesMonnaies.add(uneMonnaie);
        uneMonnaie = new Monnaie("Australian Dollar", "AUD");
        lesMonnaies.add(uneMonnaie);
        uneMonnaie = new Monnaie("Brazilian Real", "BRL");
        lesMonnaies.add(uneMonnaie);
         uneMonnaie = new Monnaie("British Pound", "GBP");         
        lesMonnaies.add(uneMonnaie);
         uneMonnaie = new Monnaie("Canadian Dollar", "CAD");         
        lesMonnaies.add(uneMonnaie);
        uneMonnaie = new Monnaie("Chinese Yuan", "CNY");         
        lesMonnaies.add(uneMonnaie);
        uneMonnaie = new Monnaie("Egyptian Pound", "EGP");         
        lesMonnaies.add(uneMonnaie);
        uneMonnaie = new Monnaie("Japanese Yen", "JPY");          
        lesMonnaies.add(uneMonnaie);
        uneMonnaie = new Monnaie("Dollar US", "USD");          
        lesMonnaies.add(uneMonnaie);
        uneMonnaie = new Monnaie("Korean Won", "KRW");          
        lesMonnaies.add(uneMonnaie);
    }
    
    
}
