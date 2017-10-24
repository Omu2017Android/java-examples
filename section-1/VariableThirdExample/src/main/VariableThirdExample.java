package main;

/**
 *
 * @author sentinel
 */
public class VariableThirdExample {

    public static void main(String[] args) {
       
        final int D1 = 3;
        //final float D2 = 127.51;
        final float D3 = 250.32F;
        final boolean B1 = true;
        
        // D1 = 100;
        // B1 = false;
        
        //byte by1 = 128;
        byte by2 = 127;
        
        System.out.println("by2: " + by2);
        
        int i1 = 257;
        byte by3 = (byte) i1;
        
        System.out.println("by3: " + by3);
        
        int i2 = 'C';
        double d1 = 'E';
        
        System.out.println("i2: " + i2);
        System.out.println("d1: " + d1);
        
        char c1 = '\u0003';
        char c2 = '\n';
        
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        
        // boolean b1 = 1;

        //TODO kayan noktali sayilarla ilgili bir ornek
        double ulker = 0.1;
        double cikolatali = 0.3;
        double gofret = 0.3 - 0.1;
        
        System.out.println("gofret: "+ gofret + "\n\tAfiyet olsun!");
    }
    
}
