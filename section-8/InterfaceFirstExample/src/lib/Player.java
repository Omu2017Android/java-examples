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
public interface Player {
    
    void play(String media);
    void stop(String media);
    void pause(String media);
    
    default void welcome() {
        System.out.println("Welcome to Player");
    }
    
}
