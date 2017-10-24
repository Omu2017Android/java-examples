package main;

/**
 *
 * @author sentinel
 */
public class SwitchCaseFirstExample {

    public static void main(String[] args) {

        int i1 = 3;

        switch (i1) {
            case -1:
                System.out.println("case -1");
                break;

            case 7:
                System.out.println("case 7");
                break;

            case 2:
                System.out.println("case 2");
                break;

            case 3:
                System.out.println("case 3");
                break;

            case 5:
                System.out.println("case 5");
                break;

            default:
                System.out.println("default");
        }

        char c1 = 'H';
        
        switch (c1) {
            case 'T':
                i1++;
                System.out.println("i1: " + i1);
                System.out.println("case T");
                break;

            case 'H':
                i1--;
                System.out.println("i1: " + i1);
                System.out.println("case H");
                break;

            default:
                System.out.println("default");
        }
        
        String t1 = "Dog";
        
        switch (t1) {
            case "dog":
                System.out.println("dog");
                break;

            case "Dog":
                t1 = "dog";
                System.out.println("case Dog - t1: " + t1);
                break;

            default:
                System.out.println("default");
        }
    }

}
