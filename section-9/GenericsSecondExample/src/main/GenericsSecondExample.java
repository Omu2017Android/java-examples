package main;

import lib.Node;

/**
 *
 * @author sentinel
 */
public class GenericsSecondExample {

    public static void main(String[] args) {
        
        Node<Double> double1 = new Node<>(5.2);
        Node<Double> double2 = new Node<>(3.1415, double1);
        Node<Double> double3 = new Node<>(7.1, double2);
        Node<Double> double5 = new Node<>(3.75, double3);
        Node<Double> double4 = new Node<>(1.61, double5);
        
        Node<Double> tmpDouble = double4;
        
        do {
            System.out.println(tmpDouble.getData());
        } while((tmpDouble = tmpDouble.getPrevious()) != null);
        
        System.out.println("---------------");
        
        Node<Integer> integer1 = new Node<>(5);
        Node<Integer> integer2 = new Node<>(3);
        Node<Integer> integer3 = new Node<>(7, integer1);
        integer2.setPrevious(integer3);
        Node<Integer> integer4 = new Node<>(4);
        Node<Integer> integer5 = new Node<>(6, integer2);
        integer4.setPrevious(integer5);
        
        Node<Integer> tmpInteger = integer4;
        
        do {
            System.out.println(tmpInteger.getData());
        } while((tmpInteger = tmpInteger.getPrevious()) != null);
        
        System.out.println("---------------");
        
        System.out.println("double1 + integer2 = " + Node.sum(double1, integer2));
        System.out.println("integer5 + integer3 = " + Node.sum(double5, integer3));
        
    }
    
}
