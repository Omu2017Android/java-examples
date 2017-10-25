package main;

import java.util.Random;

/**
 *
 * @author sentinel
 */
public class NumberExample {

    public static void main(String[] args) {
        
        Integer i1 = new Integer(3);
        Integer i2 = -6;
        Long l1 = 8L;
        
        Double d1 = 3.1415;
        Double d2 = new Double(-7.12);
        Double d3 = Double.POSITIVE_INFINITY;
        Float f1 = 1.61F;
        
        System.out.println("i1 float value: " + i1.floatValue());
        System.out.println("i2 double value: " + i2.doubleValue());
        System.out.println("l1 int value: " + l1.intValue());
        System.out.println("d1 long value: " + d1.longValue());
        System.out.println("f1 double value: " + f1.doubleValue());
        
        Integer result = i2 + d2.intValue();
        System.out.println("i2 + d2 = " + result);
        
        if(d3.isInfinite())
            System.out.println("d3 is infitiy!");
        
        System.out.println("abs(d2): " + Math.abs(d2));
        System.out.println("ceil(d1): " + Math.ceil(d1));
        System.out.println("floor(d1): " + Math.floor(d1));
        
        
        System.out.println("parseInt string value: " + Integer.parseInt("312"));
        System.out.println("parseDouble string value: " + Double.parseDouble("-153.32"));
        
        Random rand = new Random();
        
        for (int i = 0; i < 2; i++)
            System.out.println(i + ". integer random number: " + rand.nextInt());
        
        for (int i = 0; i < 2; i++)
            System.out.println(i + ". double random number: " + rand.nextDouble());
            
        for (int i = 0; i < 2; i++)
            System.out.println(i + ". double Math.random number: " + Math.random());

    }
    
}
