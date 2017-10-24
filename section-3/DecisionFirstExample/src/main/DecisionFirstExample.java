package main;

/**
 *
 * @author sentinel
 */
public class DecisionFirstExample {

    public static void main(String[] args) {
        
        int a = 3, b = 5;
        
        if (a < 7)
            System.out.println("a < 7");
        else
            System.out.println("a >= 7");
        
        if (a > 1) {
            System.out.println("a > 1");
            a--;
            System.out.println("a: " + a);
        } else {
            System.out.println("a <= 1");
        }
        
        if (a == 1)
            System.out.println("a == 1");
        else if (a < b)
            System.out.println("a < b");
        else
            System.out.println("a >= b");
        
        int c = 8;
        
        if (c == 8.25F)
            System.out.println("c == 8.25F");
        else if (c < 9.37)
            System.out.println("c < 9.37");
        
        boolean b1 = true;
        
        if (b1)
            System.out.println("b1 == true");
        
        int x = 1;
        
        /*
        
        if (x) {
            System.out.println("x != false");
        }
        
        */ 
    }
    
}
