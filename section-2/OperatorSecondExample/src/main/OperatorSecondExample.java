package main;

/**
 *
 * @author sentinel
 */
public class OperatorSecondExample {

    public static void main(String[] args) {
        
        int a = 9; // 1001
        int b = 5; // 0101
        int c = 8;
        
        boolean ba = a < b;
        boolean bb = b > c;
        boolean bc = c == a;
        boolean bd = (c == a) != bc;
        boolean be = bc && bd;
        boolean bf = (ba || bb) && bc;
        //boolean bf = (boolean) a;   
        
        System.out.println("ba: " + ba);
        System.out.println("bb: " + bb);
        System.out.println("bc: " + bc);
        System.out.println("bd: " + bd); 
        System.out.println("be: " + be); 
        System.out.println("bf: " + bf); 
        
        int aa = 4 | b;
        int ab = a & b;
        int ac = a ^ b;
        int ad = (~a & b) | (a & ~b);
        int ae = (~a & 0x0f) + 4;
        int af = 64 << 2;
        int ag = af >> 1;
        
        int ah = ag >> 8;
        int ai = ag >>> 8;
        
        System.out.println("aa: " + aa);
        System.out.println("ab: " + ab);
        System.out.println("ac: " + ac);
        System.out.println("ad: " + ad);
        System.out.println("ae: " + ae);
        System.out.println("af: " + af);
        System.out.println("ah: " + ah);
        System.out.println("ai: " + ai);
        
        int i = 10;
        
        i = i < 0 ? -i : i;
        
        System.out.println("i: " + i);
        
        int x = 4, y = 5;
        
        boolean bg = x==9 && (x++ < 12);
        boolean bh = y==9 & (y++ < 12);
        
        System.out.println("bg: " + bg);
        System.out.println("x: " + x);
        System.out.println("bh: " + bh);
        System.out.println("y: " + y);
    }
    
}
