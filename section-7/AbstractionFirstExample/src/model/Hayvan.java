package model;

/**
 *
 * @author sentinel
 */
public abstract class Hayvan {
    
    private int kutle;
    private int yas;
    private double boy;

    public Hayvan(int kutle, int yas, double boy) {
        this.kutle = kutle;
        this.yas = yas;
        this.boy = boy;
    }

    public int getKutle() {
        return kutle;
    }

    public void setKutle(int kutle) {
        this.kutle = kutle;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    @Override
    public String toString() {
        return "Hayvan{" + "kutle=" + kutle + ", yas=" + yas + ", boy=" + boy + '}';
    }
}
