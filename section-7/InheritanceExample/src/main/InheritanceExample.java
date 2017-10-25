package main;

import model.Calisan;
import model.Muhendis;

/**
 *
 * @author sentinel
 */
public class InheritanceExample {

    public static void main(String[] args) {
        
        Calisan calisan1 = new Calisan("Ahmet", "Cicek", 3000);
        
        System.out.println("calisan1: " + calisan1.toString());
        
        Muhendis muhendis1 = new Muhendis("Mehmet", "Demir", 3200, 1200);
        
        System.out.println("muhendis1: " + muhendis1.toString());
        
        Calisan muhendis1Calisan = muhendis1;
        muhendis1Calisan.setMaas(3400);
        
        System.out.println("muhendis1Calisan: " + muhendis1Calisan);
    }
    
}
