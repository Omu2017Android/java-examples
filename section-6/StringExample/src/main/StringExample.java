package main;

/**
 *
 * @author sentinel
 */
public class StringExample {

    public static void main(String[] args) {
        
        String s1 = new String("Hello World!");
        String s2 = "  Ondokuz Mayis Universitesi falan";
        
        System.out.println(s1 + " " + s2);
        
        System.out.println("s1 length: " + s1.length());
        
        if (!s1.equals(s2))
            System.out.println("s1 and s2 not equal");
        
        s1.replace('l', 'k');
        
        System.out.println("replace 'l' to 'k' s1: " + s1); // Attention
        System.out.println("replace 'e' to 't' s2: " + s2.replace('e', 't'));
        
        System.out.println("s1 substring [8-length]: " + s1.substring(3, s1.length()));
        System.out.println("s1 string \"orl\" index: " + s1.indexOf("orl"));
        
        System.out.println("s2 lower case: " + s2.toLowerCase());
        System.out.println("s2 upper case: " + s2.toUpperCase());
        
        String[] splitResult = s2.split("si");
        
        for(String s: splitResult) {
            System.out.println("splitResult array in (s value): " + s);
        }
        
        System.out.println("s2     : " + s2);
        System.out.println("s2 trim: " + s2.trim());
        System.out.println("s2     : " + s2.concat(" sona ekleme"));
        System.out.println("s2 contains \"Mayis\" string: " + s2.contains("Mayis"));
        
        StringBuilder sb1 = new StringBuilder("String builder example");
        
        System.out.println("sb1 : " + sb1);
        
        sb1.append("Append string ");
        
        System.out.println("sb1 append: " + sb1);
        
        sb1.reverse();
        
        System.out.println("sb1 reverse: " + sb1);
    }
    
}
