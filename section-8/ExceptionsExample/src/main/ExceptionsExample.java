package main;

/**
 *
 * @author sentinel
 */
public class ExceptionsExample {

    public static void main(String[] args) {
        
        int x, y;
        
        try {
            x = 0;
            y = 72 / x;
            System.out.println("Divide complete.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
            System.out.println("Error message: " + e.getMessage());
        }
        
        System.out.println("Program continue...");
        
        try {
            x = 7 / 0;
        } catch (NullPointerException e) {
            System.out.println("7 / 0 - error dirst catch");
        } catch (ArithmeticException e ) {
            System.out.println("7 / 0 - error seconde catch");
        } catch (Exception e) {
            System.out.println("7 / 0 - All error run.");
        } 
        finally {
            System.out.println("7 / 0 - finally block");
        }
        
        try {
            throw new NullPointerException("throw custom error");
        } catch (ArrayStoreException e) {
            System.out.println("Throw error - ArrayStore catch block");
        } catch (Exception e) {
            System.out.println("Throw error - All error run");
        } 
        finally{
            System.out.println("Throw error finally block.");
        }
        
        try {
            int i = 3;
        } catch (Exception e) {
            System.out.println("i - 3 Exception catch block");
        } 
        finally {
            System.out.println("i = 3 - finally block");
        }
        
        try {
            int c[] = { 1 };
            c[73] = 14;
        } catch (ArrayStoreException e) {
            System.out.println("c[73] - ArrayStoreException catch block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("c[73] - ArrayIndexOutOfBoundsException catch block. " + "Error Message: " + e.getMessage());
        }
        
        System.out.println("Program finish...");
        
    }
    
}
