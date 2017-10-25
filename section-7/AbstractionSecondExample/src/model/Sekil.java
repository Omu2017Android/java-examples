package model;

/**
 *
 * @author sentinel
 */
public abstract class Sekil {
    
    protected double alan;
    protected double cevre;

    protected abstract double alanHesapla();
    protected abstract double cevreHesapla();
    
    public double getAlan() {
        return alan;
    }

    public void setAlan(double alan) {
        this.alan = alan;
    }

    public double getCevre() {
        return cevre;
    }

    public void setCevre(double cevre) {
        this.cevre = cevre;
    }
    
    private double alanVeCevreToplami() {
        return alan + cevre;
    }
    
    @Override
    public String toString() {
        return "Sekil{" + "alan=" + alan + ", cevre=" + cevre + '}' + " Alan ve cevre toplami: " + alanVeCevreToplami();
    }
      
}
