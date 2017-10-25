package model;

/**
 *
 * @author sentinel
 */
public class Dikdortgen extends Sekil{
    
    private double en;
    private double boy;

    public Dikdortgen(double en, double boy) {
        this.en = en;
        this.boy = boy;
        
        alan = alanHesapla();
        cevre = cevreHesapla();
    }
    
    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        this.en = en;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    @Override
    protected double alanHesapla() {
        return en * boy;
    }

    @Override
    protected double cevreHesapla() {
        return 2 * (en + boy);
    }
    
}
