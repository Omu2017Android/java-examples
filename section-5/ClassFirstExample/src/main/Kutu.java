package main;

/**
 *
 * @author sentinel
 */
public class Kutu {
    
    int en;
    int boy;
    int yukseklik;
    
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
    
}
