package main;

/**
 *
 * @author sentinel
 */
public class ScopeExample {

    public static void main(String[] args) {
        
        int x = 12;
        
        if (true) {
            int y = 5;
            System.out.println("/x: " + x);
            System.out.println("/y: " + y);
        }
        
        System.out.println("x: " + x);
        // System.out.println("y: " + y);
        
        {
            int z = 3;
            System.out.println("-z: " + z);
        }
        
        // System.out.println("z: " + z);
        
        {
            int t = 5;
            {
                System.out.println("**t: " + t);
                t = 2;
            }
            System.out.println("*t: " + t);
        }
        
        // System.out.println("t: " + t);
        
        int[] numbers;
        
        {
            numbers = new int[3];
            numbers[2] = 8;
            
            System.out.println("+numbers[2]: " + numbers[2]);
        }
        
        System.out.println("numbers[2]: " + numbers[2]);
    }
    
}
