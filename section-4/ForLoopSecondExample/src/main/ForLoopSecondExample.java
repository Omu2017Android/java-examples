package main;

/**
 *
 * @author sentinel
 */
public class ForLoopSecondExample {

    public static void main(String[] args) {
        
        for(int i = 0, j = 0; i < 10 || j < 20; i++,j+=2)
            System.out.println("i: " + i + " j: " + j);
        
        System.out.println("------------------");
        
        for(int i = 0; i < 20; i++)
            if(i == 15)
                break;
            else if (i % 2 == 0)
                continue;
            else
                System.out.println("i: " + i);
        
        System.out.println("------------------");
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++)
                if(i < j)
                    System.out.print("*");
            System.out.println("");
        }
        
        System.out.print("------------------");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if(3 - i < j &&  j < 3 + i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            
            System.out.println("");
        }
        
        System.out.println("------------------");
        
        int[][] matrix = new int[2][2];
        
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;
        
        for(int i = 0; i < matrix.length ; i++) {
            
            for(int j = 0; j < matrix[i].length ; j++){
                
                System.out.print(matrix[i][j]+"\t ");
            }
            
            System.out.println();
        }
        
        System.out.println("------------------");
        
        loops:
        for(int i = 0; i < 7; i++)
            for(int j = 0; j < 2; j++)
                if(i == 2)
                    continue loops;
                else if (i == 4)
                    break loops;
                else
                    System.out.println("i: " + i + " j: " + j);
        
    }
    
}
