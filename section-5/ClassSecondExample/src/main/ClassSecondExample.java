package main;

/**
 *
 * @author sentinel
 */
public class ClassSecondExample {

    public static void main(String[] args) {
        
        Kutu kutu1 = new Kutu();
        Kutu kutu2 = new Kutu();
        
        System.out.println("Kutu1'in baslangicta yuzey alani: " + kutu1.yuzeyAlani());
        System.out.println("Kutu1'in baslangicta hacmi: " + kutu1.hacmi());
        
        System.out.println("Kutu2'nin baslangicta yuzey alani: " + kutu2.yuzeyAlani());
        System.out.println("Kutu2'nin baslangicta hacmi: " + kutu2.hacmi());
        
        kutu1.olculeriAyarla(3, 4, 5);
        kutu2.olculeriAyarla(2, 5, 1);
        
        System.out.println("Kutu1'in yuzey alani: " + kutu1.yuzeyAlani());
        System.out.println("Kutu1'in hacmi: " + kutu1.hacmi());
        
        kutu1 = null;
        System.gc();
        
        System.out.println("Kutu2'nin yuzey alani: " + kutu2.yuzeyAlani());
        System.out.println("Kutu2'nin hacmi: " + kutu2.hacmi());
    }
    
}
