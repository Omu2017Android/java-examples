package main;

/**
 *
 * @author sentinel
 */
public class WhileLoopExample {

    public static void main(String[] args) {
        
        int i = 0;
        
        while (i < 5) {
            System.out.println("i: " + i);
            ++i;
        }
        
        char c = 'A';
        
        while (c != 'E')
            System.out.println("c: " + c++);
        
        i = 0;
        
        while (true) {
            
            if(i > 15)
                break;
            
            if(i % 2 != 0)
                System.out.println("Tek sayi: " + i);
            ++i; 
        }
        
        i = 0;
        
        while(i++ < 15) {
            
            if (i % 2 != 0)
                continue;
            
            System.out.println("Cift sayi: " + i);
        }
    }
    
}
