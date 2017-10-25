package main;

import model.Hayvan;
import model.Kopek;

/**
 *
 * @author sentinel
 */
public class AbstractionFirstExample {

    public static void main(String[] args) {
        
        Kopek kopek1 = new Kopek(13, 26, 2, 43.8);
        Hayvan kopek2 = new Kopek(17, 21, 4, 37.5);
        
        System.out.println("kopek1: " + kopek1.toString());
        System.out.println("kopek2: " + kopek2.toString());
    }
    
}
