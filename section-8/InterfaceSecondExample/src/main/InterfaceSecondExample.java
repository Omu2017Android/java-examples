package main;

import lib.Hayvan;
import lib.Kus;
import lib.Pegasus;

/**
 *
 * @author sentinel
 */
public class InterfaceSecondExample {

    public static void main(String[] args) {
        
        Pegasus ucanAt1 = new Pegasus("Düldül", 43);
        
        ucanAt1.atSesiCikar();
        ucanAt1.kusSesiCikar();
        ucanAt1.kanatCirp();
        
        System.out.println("ucanAt1: " + ucanAt1);
        
        Kus kus1 = new Pegasus("Boncuk", 7);
        
        kus1.kusSesiCikar();
        kus1.kanatCirp();
        // kus1.atSesiCikar();
        
        Hayvan hayvan1 = new Pegasus("Atilgan", 21);
        
        // hayvan1.kusSesiCikar();
        // hayvan1.kanatCirp();
        // hayvan1.atSesiCikar();
        
        System.out.println("hayvan1: " + hayvan1.toString());
    }
    
}
