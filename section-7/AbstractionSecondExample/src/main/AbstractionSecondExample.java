package main;

import model.Daire;
import model.Dikdortgen;
import model.Sekil;

/**
 *
 * @author sentinel
 */
public class AbstractionSecondExample {

    public static void main(String[] args) {
        
        Daire daire1 = new Daire(4);
        Dikdortgen dikdortgen1 = new Dikdortgen(5, 7);
        
        System.out.println("daire1: " + daire1.toString());
        System.out.println("dikdortgen1: " + dikdortgen1.toString());
        
        Sekil daire2 = new Daire(3);
        Sekil dikdortgen2 = new Dikdortgen(12, 10);
        
        System.out.println("daire2: " + daire2.toString());
        System.out.println("dikdortgen2: " + dikdortgen2.toString());
        
    }
    
}
