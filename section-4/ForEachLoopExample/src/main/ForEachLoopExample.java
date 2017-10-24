package main;

/**
 *
 * @author sentinel
 */
public class ForEachLoopExample {

    public static void main(String[] args) {
        
        char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F'};
        
        for (char l: letters) 
            System.out.println("l: " + l);
        
        int[] prices;
        prices = new int[7];
        prices[0] = 1500;
        prices[1] = 1100;
        prices[2] = 1800;
        prices[3] = 1250;
        prices[4] = 2500;
        prices[5] = 1340;
        prices[6] = 980;
 
        for (int p: prices) {
            
            if (p > 2000)
                break;
            else if(p < 1200)
                continue;
            
            System.out.println("p+50: " + (p+50));
            // System.out.println("p+50: " + p + 50);
        }
    }
    
}
