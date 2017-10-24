package main;

/**
 *
 * @author sentinel
 */
public class ArrayFirstExample {

    public static void main(String[] args) {
        
        int prime_numbers [];
        prime_numbers = new int[12];
        
        prime_numbers[0] = 2;
        prime_numbers[1] = 3;
        prime_numbers[2] = 5;
        
        System.out.println("prime_numbers[1]: " + prime_numbers[1]);
        
        char[] genders = new char[2];
        
        genders[0] = 'M';
        genders[1] = 'F';
        // genders[2] = 'M';
        
        System.out.println("genders[0]: " + genders[0]);
        
        char[] letters = { 'A', 'B', 'C', 'D' };
        
        System.out.println("letters[2]: " + letters[2]);
        System.out.println("letters.length: " + letters.length);
    }
    
}
