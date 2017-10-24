package main;

/**
 *
 * @author sentinel
 */
public class ForLoopFirstExample {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
        }

        for (double d = 0; d < 0.25; d += 0.01) {
            System.out.println("d: " + d);
        }

        for (char ch = 'a'; ch != 'e'; ++ch) {
            System.out.println("ch: " + ch);
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "sayisi cift.");
            } else {
                System.out.println(i + "sayisi tek.");
            }
        }

        int x = 0;

        for (; x < 10; x += 2) {
            System.out.println("x: " + x);
        }

        for (int k = 0; k < 10; ) {

            if (k < 5) {
                k++;
            } else {
                k += 2;
            }

            System.out.println("k: " + k);
        }

        char c = 'A';

        for (; c != 'E';) {
            System.out.println("c: " + ++c);
        }

        /*
        for( ; ; )
            System.out.println("Sonsuz dongu");
         */
    }

}
