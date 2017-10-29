package main;

import lib.Araba;
import lib.BenzinliMotor;
import lib.LpgliMotor;
import lib.Motor;

/**
 *
 * @author sentinel
 */
public class InterfaceThirdExample {

    public static void main(String[] args) {
        
        Motor benzinliMotor = new BenzinliMotor();
        Motor lpgliMotor = new LpgliMotor();
        
        Araba benzinliAraba = new Araba(benzinliMotor);
        Araba lpgliAraba = new Araba(lpgliMotor);
        
        benzinliAraba.calistir();
        lpgliAraba.calistir();
        
        benzinliAraba.durdur();
        lpgliAraba.durdur();
        
        benzinliAraba.setMotor(lpgliMotor);
        benzinliAraba.calistir();
        benzinliAraba.durdur();
    }
    
}
