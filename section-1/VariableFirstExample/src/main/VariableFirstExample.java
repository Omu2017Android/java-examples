package main;

/**
 *
 * @author sentinel
 */
public class VariableFirstExample {

    public static void main(String[] args) {
        
        int i1 = 1, i2, i3 = 3;
        
        // System.out.println("i2: " + i2);
        
        i2 = 2; 
        
        System.out.println("i2: " + i2);
        
        int i4 = 14;
        short s1 = 123;
        long l1 = 144l; // buyus L de kullanilabilir.
        float f1 = 147.35f; // buyuk F de kullanilabilir.
        double d1 = 17.75d; // = 17.75 de aynidir. buyuk D kullanilabilir
        boolean b1 = true;
        char c1 = 'M';
        byte by1 = 0b0001;
        
        System.out.println("i4: " + i4);
        System.out.println("s1: " + s1);
        System.out.println("l1: " + l1);
        System.out.println("f1: " + f1);
        System.out.println("d1: " + d1);
        System.out.println("b1: " + b1);
        System.out.println("c1: " + c1);
        System.out.println("by1: " + by1);    
    }
    
}
