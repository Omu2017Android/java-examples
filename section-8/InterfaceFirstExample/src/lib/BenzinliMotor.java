/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

/**
 *
 * @author sentinel
 */
public class BenzinliMotor implements Motor {

    @Override
    public void ac() {
        System.out.println("Benzinli motor ac!");
    }

    @Override
    public void kapa() {
        System.out.println("Benzinli motor kapa!");
    }
    
    
}
