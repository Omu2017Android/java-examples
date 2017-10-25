package main;

import lib.Day;

/**
 *
 * @author sentinel
 */
public class EnumFirstExample {

    public static void main(String[] args) {

        Day wednesday = Day.CARSAMBA;

        System.out.println("wednesday: " + wednesday);

        if (wednesday != Day.SALI) {
            System.out.println("wednesday not equal SALI");
        }

        switch (wednesday) {
            case PAZARTESI:
                System.out.println("Pazartesiyi kimse sevmez");
                break;

            case CARSAMBA:
                System.out.println("Bugun dersim var.");
                break;

            case CUMA:
                System.out.println("En guzel gun Cuma.");
                break;
                
            default:
                System.out.println("Herhangi bir gun");
        }

    }

}
