package main;

import lib.Box;

/**
 *
 * @author sentinel
 */
public class GenericsFirstExample {

    public static void main(String[] args) {
        
        Box<Integer> integerBox = new Box<>();
        Box<Double> doubleBox = new Box<>(8.24);
        Box<String> stringBox = new Box<>();
        
        integerBox.setT(new Integer(7));
        stringBox.setT("Hello World!");
        
        System.out.println("integerBox: " + integerBox.getT());
        System.out.println("doubleBox: " + doubleBox.getT());
        System.out.println("stringBox: " + stringBox.getT());
        
        integerBox.setT(143);
        
        System.out.println("integerBox: " + integerBox.getT());
    }

}
