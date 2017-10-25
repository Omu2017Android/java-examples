package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author sentinel
 */
public class ListExample {

    public static void main(String[] args) {
        
        List<String> turkeyCities = new ArrayList<>(); // LinkedList, Vector, Stack
        
        System.out.println("turkeyCities isEmpty: " + turkeyCities.isEmpty());
        
        turkeyCities.add("Yozgat");
        turkeyCities.add("Corum");
        
        System.out.println("turkeyCities size: " + turkeyCities.size());
        
        turkeyCities.add("Cankiri");
        
        System.out.println("turkeyCities: " + turkeyCities);
        
        turkeyCities.remove("Corum");
        
        System.out.println("remove after turkeyCities: " + turkeyCities);
        
        for(String s: turkeyCities) {
            System.out.println("s value: " + s);
        }
        
        List<String> newTurkeyCities = Arrays.asList("Duzce", "Kirikkale");
        
        System.out.println("newTurkeyCities: " + newTurkeyCities);
        
        System.out.println("turkeyCities contains \"Duzce\": " + turkeyCities.contains("Duzce"));
        
        turkeyCities.addAll(newTurkeyCities);
        
        System.out.println("turkeyCities addAll newTurkeyCities: " + turkeyCities);
        System.out.println("newTurkeyCities addAll turkeyCities after contains \"Duzce\": " + turkeyCities.contains("Duzce"));
    }
    
}
