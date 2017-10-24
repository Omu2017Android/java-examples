package main;

/**
 *
 * @author sentinel
 */
public class Kutu {
    
    int en;
    int boy;
    int yukseklik;
    
    Kutu() {
        System.out.println("Varsayilan yapilandirici calisti");
        en = 1;
        boy = 1;
        yukseklik = 1;
    }
    
    int yuzeyAlani() {
        return 2 * (en * boy + boy * yukseklik + en * yukseklik);
    }
    
    int hacmi() {
        return en * boy * yukseklik;
    }
    
    void olculeriAyarla(int e, int b, int y) {
        en = e;
        boy = b;
        yukseklik = y;
    }
    
    protected void finalize() {
        System.out.println("Kutu yok edilmeden once calisir... Yok edilen kutu olculeri: " + en + " " + boy + " " + yukseklik);
    }
    
}
