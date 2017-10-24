package main;

/**
 *
 * @author sentinel
 */
public class DecisionSecondExample {

    public static void main(String[] args) {
        
        int a = 17, b = 7, c = 13;
        
        if (a < 15)
            ; // boş deyim
        else
            System.out.println("a >= 15");
        
        if (c == 8 && c++ < 100) 
            System.out.println("(c == 8 && c++ < 100) c: " + c);
        else
            System.out.println("(c == 8 && c++ < 100) c: " + c);
        
        if (a == 17 || b++ < 13){
            System.out.println("(a == 17 || b++ < 13) a: " + a);
            System.out.println("(a == 17 || b++ < 13) b: " + b);
        }
        
        if (!(a == 17 || b++ < 13))
            ;
        else {
            System.out.println("!(a == 17 || b++ < 13) a: " + a);
            System.out.println("!(a == 17 || b++ < 13) b: " + b);
        }
        
        if (a == 16 || b++ == 7) {
            System.out.println("(a == 16 || b++ < 7) a: " + a);
            System.out.println("(a == 16 || b++ < 7) b: " + b);
        }
        
        System.out.println("b: " + b);
        
        if (a > -30)
            if(a < 30)
                System.out.println("-30 < a && a < 30");
            else {
                System.out.print("a > -30 && ");
                System.out.print("a >= 30\n");
            }
        else
            System.out.println("a <= -30");
        
        String text = "hello";  // Bir string tanimlamasi. Konu sonra islenecek
        
        if (text == "hello")
            System.out.println("text == hello");
    }
    
}
