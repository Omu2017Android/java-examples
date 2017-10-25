package main;

import lib.ParaBirimi;

/**
 *
 * @author sentinel
 */
public class EnumSecondExample {

    public static void main(String[] args) {
        
        ParaBirimi tr = ParaBirimi.TURKIYE;
        
        System.out.println("Turkiye para birimi kisaltmasi: " + tr.getKisaltma());
        System.out.println("Turkiye para birimi adi: " + tr.getBirimAdi());
        System.out.println("Ingiltere para birimi kisaltmasi: " + ParaBirimi.INGILTERE.getKisaltma());
        System.out.println("Ingiltere para birimi adi: " + ParaBirimi.INGILTERE.getBirimAdi());
        
    }
    
}
