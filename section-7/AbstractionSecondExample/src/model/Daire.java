package model;

/**
 *
 * @author sentinel
 */
public class Daire extends Sekil {
    
    private double yaricap;

    public Daire(double yaricap) {
        this.yaricap = yaricap;
        
        alan = alanHesapla();
        cevre = cevreHesapla();
    }
    
    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    protected double alanHesapla() {
        return Math.PI * Math.pow(yaricap, 2);
    }

    @Override
    protected double cevreHesapla() {
        return 2 * Math.PI * yaricap;
    }
    
}
