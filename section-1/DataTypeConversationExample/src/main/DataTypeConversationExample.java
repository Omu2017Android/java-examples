package main;

/**
 *
 * @author sentinel
 */
public class DataTypeConversationExample {

    public static void main(String[] args) {
        
        double d1 = 358.99;
        float f1 = 144.21F;

        int i1 = (int)d1;
        int i2 = (int)f1;
        
        System.out.println("i1: " + i1);
        System.out.println("i2: " + i2);
        
        byte b1 = (byte) d1;
        
        System.out.println("d1: " + d1);
        
        double d2 = 'Z';
        
        System.out.println("d2: " + d2);
        
        char c1 = 'C';
        int i3 = (int)'D';
        System.out.println("i3: " + i3);
        
        i3 = c1;
        System.out.println("i3: " + i3);
        
        int i4 = 2_147_483_647;
        //int i5 = 2_147_483_648;
        byte b2 = (byte) i4;
        
        System.out.println("i4: " + i4);
        System.out.println("b2: " + b2);
    }
    
}
