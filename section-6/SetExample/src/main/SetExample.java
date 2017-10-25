package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author sentinel
 */
public class SetExample {

    public static void main(String[] args) {

        Set<Character> setA = new HashSet();

        if (setA.isEmpty()) {
            setA.add('O');
        }

        setA.add('M');
        setA.add('M');
        setA.add('U');
        setA.add('T');
        setA.add('C');
        setA.add('T');

        System.out.println("setA: " + setA);

        setA.remove('O');

        System.out.println("setA: " + setA);
        
        System.out.println("setA contains 'E': " + setA.contains('E'));
        
        setA.addAll(Arrays.asList('C', 'K', 'U', 'L'));
        
        System.out.println("setA after addAll: " + setA);
    }

}
