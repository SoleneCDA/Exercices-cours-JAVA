/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labo;

/**
 *
 * @author stagiaire
 */
public class Labo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
       /*Question 1     */
        System.out.println("***Creation des souris de laboratoire***");
       Souris s1 = new Souris (50, "blanche",2, 30);
       Souris s2 = new Souris (45, "grise",3);
       Souris s3 = new Souris (35, "bronze");
       Souris s4 = new Souris (s1);
       Souris s5 = new Souris (s2);
       
       
       /*Question 3     */
        System.out.println("caracteristiques de s1 :" + s1.getCaracteristiques());
       System.out.println("caracteristiques de s2 :" + s2.getCaracteristiques());
       System.out.println("caracteristiques de s3 :" + s3.getCaracteristiques());
       System.out.println("caracteristiques de s4 :" + s4.getCaracteristiques());
       System.out.println("caracteristiques de s5 :" + s5.getCaracteristiques());
       
       if (s4.equals(s1)){
           System.out.println("s1 et s4 sont identiques");
       }else {
           System.out.println("s1 et s4 sont différentes");
       }
       
       
       if (s5.equals(s2)){
           System.out.println("s2 et s5 sont identiques");
       }else {
           System.out.println("s2 et s5 sont différentes");
       }
        s2.comparer(s5);
        s1.comparer(s4);
       /*Question 4     */
        System.out.println("***Vieillissement des souris de laboratoire***");
       
       s1.vieillir();s1.vieillir();
        System.out.println("caracteristiques de s1 :" + s1.getCaracteristiques());
        s2.vieillir();s2.vieillir();
        System.out.println("caracteristiques de s2 :" + s2.getCaracteristiques());
        s3.vieillir();s3.vieillir();
        System.out.println("caracteristiques de s3 :" + s3.getCaracteristiques());
        s4.vieillir();s4.vieillir();
        System.out.println("caracteristiques de s4 :" + s4.getCaracteristiques());
        s5.vieillir();s5.vieillir();
        System.out.println("caracteristiques de s5 :" + s5.getCaracteristiques());
        
        if (s4.equals(s1)){
           System.out.println("s1 et s4 sont identiques");
       }else {
           System.out.println("s1 et s4 sont différentes");
       }
        
        if (s5.equals(s2)){
           System.out.println("s2 et s5 sont identiques");
       }else {
           System.out.println("s2 et s5 sont différentes");
       }
        s2.comparer(s5);
        s1.comparer(s4);
        
         /*Question 5     */
        System.out.println("***Etat des souris à la fin de leur vie***");
        
        s1.evolue();
        System.out.println("caracteristiques de s1 :" + s1.getCaracteristiques());
         s2.evolue();
        System.out.println("caracteristiques de s2 :" + s2.getCaracteristiques());
         s3.evolue();
        System.out.println("caracteristiques de s3 :" + s3.getCaracteristiques());
         s4.evolue();
        System.out.println("caracteristiques de s4 :" + s4.getCaracteristiques());
         s5.evolue();
        System.out.println("caracteristiques de s5 :" + s5.getCaracteristiques());
        
        
         if (s4.equals(s1)){
           System.out.println("s1 et s4 sont identiques");
       }else {
           System.out.println("s1 et s4 sont différentes");
       }
        
        if (s5.equals(s2)){
           System.out.println("s2 et s5 sont identiques");
       }else {
           System.out.println("s2 et s5 sont différentes");
       }
        
        /*Question 6     */
      
        s2.comparer(s5);
        s1.comparer(s4);
        
        
    }
    
}
