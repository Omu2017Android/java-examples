package main;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 *
 * @author sentinel
 */
public class BigDecimalExample {

    public static void main(String[] args) {

        BigDecimal firstNumber = new BigDecimal(BigInteger.ZERO);
        BigDecimal secondNumber = new BigDecimal("8");

        System.out.println("firstNumber: " + firstNumber);
        System.out.println("secondNumber: " + secondNumber);

        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal("0.01");
        
        System.out.println("bd1 = " + bd1);
        System.out.println("bd2 = " + bd2);

        firstNumber = new BigDecimal("3");
        
        System.out.println("firstNumber + secondNumber = " + firstNumber.add(secondNumber));
        System.out.println("secondNumber - firstNumber = " + secondNumber.subtract(firstNumber));
        System.out.println("firstNumber * secondNumber = " + firstNumber.multiply(secondNumber));
        System.out.println("secondNumber / 3 = " + secondNumber.divide(new BigDecimal("3"), 2, RoundingMode.HALF_DOWN));
        
        System.out.println("firstNumber - 100 and abs: " + firstNumber.subtract(new BigDecimal("100")).abs());
    }

}
