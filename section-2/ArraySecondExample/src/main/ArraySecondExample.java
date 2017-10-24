package main;

/**
 *
 * @author sentinel
 */
public class ArraySecondExample {

    public static void main(String[] args) {
        
        int twoA[][] = new int[4][5];
        
        twoA[3][2] = 3;
        twoA[1][4] = 8;
        twoA[1][2] = 7*3/2;
        
        System.out.println("twoA[1][2]: " + twoA[1][2]);
        
        char[][] twoB = new char[2][3];
        
        twoB[1][2] = 'C';
        twoB[1][0] = 'A';
        
        System.out.println("twoB[1][0]: " + twoB[1][0]);
        
        float twoC[][] = new float[4][];
        
        twoC[0] = new float[1];
        twoC[1] = new float[2];
        twoC[2] = new float[4];
        twoC[3] = new float[1];
        
        // twoC[0][2] = 3.14F;
        twoC[2][2] = 388.40F;
        
        System.out.println("twoC.length: " + twoC.length);
        System.out.println("twoC[0].length: " + twoC[0].length);
        System.out.println("twoC[1].length: " + twoC[1].length);
        System.out.println("twoC[2].length: " + twoC[2].length);
        System.out.println("twoC[3].length: " + twoC[3].length);
        
        double twoD[][] = {
            {0/2, 1*3, 4+1},
            {4, 8, 2},
            {3, 1, 2}
        }; 
        
        System.out.println("twoD[0][1]: " + twoD[0][1]);
    }
    
}
