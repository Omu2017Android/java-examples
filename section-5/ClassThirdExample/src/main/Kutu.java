package main;

/**
 *
 * @author sentinel
 */
public class Kutu {
    
    double en;
    double boy;
    double yukseklik;
    
    Kutu() {
        System.out.println("Varsayilan yapilandirici calisti");
        en = 1;
        boy = 1;
        yukseklik = 1;
    }
    
    Kutu(double en, double boy, double yukseklik) {
        System.out.println("Parametreli yapilandirici calisti");
        this.en = en;
        this.boy = boy;
        this.yukseklik = yukseklik;
    }
    
    double yuzeyAlani() {
        return 2 * (en * boy + boy * yukseklik + en * yukseklik);
    }
    
    double hacmi() {
        return en * boy * yukseklik;
    }
    
    void olculeriAyarla(double en, double boy, double yukseklik) {
        this.en = en;
        this.boy = boy;
        this.yukseklik = yukseklik;
    }
    
    void olculeriAyarla(double kenar) {
        en = kenar;
        boy = kenar;
        yukseklik = kenar;
    }
    
    protected void finalize() {
        System.out.println("Kutu yok edilmeden once calisir... Yok edilen kutu olculeri: " + en + " " + boy + " " + yukseklik);
    }
    
}
