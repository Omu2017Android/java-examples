package main;

/**
 *
 * @author sentinel
 */
public class OperatorFirstExample {

    public static void main(String[] args) {
        
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("e: " + e);
        
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - da;
        double de = -dd;
        
        System.out.println("da: " + da);
        System.out.println("db: " + db);
        System.out.println("dc: " + dc);
        System.out.println("dd: " + dd);
        System.out.println("de: " + de);
        
        int aa = 1;
        int ab = 2;
        int ac = 3;
        int ad = 4;
        int ae = 3;
        
        aa += 5;
        ab -= 3;
        ac *= 8;
        ad /= 3;
        ae %= (8 % 3);
        
        System.out.println("aa: " + aa);
        System.out.println("ab: " + ab);
        System.out.println("ac: " + ac);
        System.out.println("ad: " + ad);
        System.out.println("ae: " + ae);
        
        int i1 = 8, i2 = 3, i3 = 1;
        
        i1++;
        System.out.println("i1: " + i1++);
        
        i2++;
        System.out.println("i2: " + ++i2);
        
        System.out.println("i3: " + (i3++)+8);
        
        i1--;
        System.out.println("i1: " + i1--);
        
        i2--;
        System.out.println("i2: " + --i2);
        
        //System.out.println("i3: " + (i3--)-8);
    }
    
}
