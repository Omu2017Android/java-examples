package main;

/**
 *
 * @author sentinel
 */
public class SwitchCaseSecondExample {

    public static void main(String[] args) {

        int i1 = 6;

        switch (i1) {
            case 8:
                System.out.println("case 8");
                break;

            case 5:
                System.out.println("case 5");
                break;

            default:
                System.out.println("Not found!");
        }

        switch (i1) {
            case 4:
                System.out.println("case 3");
                break;

            case 6:
                System.out.println("case 3");

            case 7:
                System.out.println("case 3");

            case 11:

            case 1:
                System.out.println("case 1");
                break;

            default:
                System.out.println("default");
        }

        char letter = 'B';

        switch (letter) {
            case 'A':
                System.out.println("case A");

            case 'B':
                System.out.println("case B");

            case 'C':
                System.out.println("case C");

            case 'D':
                if (i1 < 12) {
                    break;
                }
                System.out.println("case D");

            case 'E':
                System.out.println("case E");

            default:
                System.out.println("default");
        }

        /*
        double d1 = 3.1415;
        
        switch (d1) {
            case 2.7483:
                break;
                
            case 3.1415:
                break;
                
            default:
                break;     
        }
        
         */
    }

}
