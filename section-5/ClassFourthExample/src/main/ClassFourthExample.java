package main;

/**
 *
 * @author sentinel
 */
public class ClassFourthExample {

    public static void main(String[] args) {
        
        System.out.println("Kutu sayisi: " + Kutu.kacKutuVar());
        
        Kutu kutu1 = new Kutu();
        
        System.out.println("Kutu sayisi: " + Kutu.kacKutuVar());
        
        Kutu kutu2 = new Kutu(5.3, 12, 4.21);
        
        System.out.println("Kutu sayisi: " + Kutu.kacKutuVar());
        
        Kutu kutu2Kopyasi = new Kutu(kutu2);
        Kutu kutu2Referansi = kutu2.nesneyiDondur();
        kutu2Referansi.olculeriAyarla(2, 3, 4);
        
        System.out.println("Kutu1'in baslangicta yuzey alani: " + kutu1.yuzeyAlani());
        System.out.println("Kutu1'in baslangicta hacmi: " + kutu1.hacmi());
        
        System.out.println("Kutu2'nin baslangicta yuzey alani: " + kutu2.yuzeyAlani());
        System.out.println("Kutu2'nin baslangicta hacmi: " + kutu2.hacmi());
        
        System.out.println("Kutu2referansi baslangicta yuzey alani: " + kutu2Referansi.yuzeyAlani());
        System.out.println("Kutu2referansi baslangicta hacmi: " + kutu2Referansi.hacmi());
        
        System.out.println("Kutu2kopyasinin baslangicta yuzey alani: " + kutu2Kopyasi.yuzeyAlani());
        System.out.println("Kutu2kopyasinin baslangicta hacmi: " + kutu2Kopyasi.hacmi());
        
        kutu1.olculeriAyarla(3.1, 4, 5);
        kutu2.olculeriAyarla(2, 5.4, 1);
        
        System.out.println("Kutu1'in yuzey alani: " + kutu1.yuzeyAlani());
        System.out.println("Kutu1'in hacmi: " + kutu1.hacmi());
        
        kutu1 = null;
        System.gc();
        
        System.out.println("Kutu2'nin yuzey alani: " + kutu2.yuzeyAlani());
        System.out.println("Kutu2'nin hacmi: " + kutu2.hacmi());
        
        kutu2.olculeriAyarla(4);
        
        System.out.println("Kutu2'nin yuzey alani: " + kutu2.yuzeyAlani());
        System.out.println("Kutu2'nin hacmi: " + kutu2.hacmi());
        
        kutu2 = null;
    }
    
}
