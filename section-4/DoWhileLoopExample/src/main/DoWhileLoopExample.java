package main;

/**
 *
 * @author sentinel
 */
public class DoWhileLoopExample {

    public static void main(String[] args) {
        
        int i = 0;
        
        do {
            System.out.println("i: " + i++);
            
        } while(i != 0 && i < 12);
        
        i = 0;
        
        do {
            if (i++ > 15)
                break;
            else if(i == 12)
                continue;
            else
                System.out.println("*i: " + i);
            
        } while(true);
    }
    
}
