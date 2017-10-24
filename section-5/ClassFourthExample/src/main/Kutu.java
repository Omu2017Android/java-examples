package main;

/**
 *
 * @author sentinel
 */
public class Kutu {
    
    double en;
    double boy;
    double yukseklik;
    
    static int kutuSayisi = 0;
    
    Kutu() {
        System.out.println("Varsayilan yapilandirici calisti");
        en = 1;
        boy = 1;
        yukseklik = 1;
        kutuSayisi++;
    }
    
    Kutu(double en, double boy, double yukseklik) {
        System.out.println("Parametreli yapilandirici calisti");
        this.en = en;
        this.boy = boy;
        this.yukseklik = yukseklik;
        kutuSayisi++;
    }
    
    Kutu(Kutu kutu) {
        System.out.println("Kopya yapilandirici calisti");
        this.en = kutu.en;
        this.boy = kutu.boy;
        this.yukseklik = kutu.yukseklik;
        kutuSayisi++;
    }
    
    Kutu nesneyiDondur() {
        return this;
    }
    
    boolean kutularEsitMi(Kutu kutu) {
        return this.en == kutu.en && this.boy == kutu.boy && this.yukseklik == kutu.yukseklik;
    }
    
    static int kacKutuVar() {
        return kutuSayisi;
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
        kutuSayisi--;
    }
    
}
