package model;

/**
 *
 * @author sentinel
 */
public class Kopek extends Hayvan {
    
    private int kuyrukUzunlugu;

    public Kopek(int kuyrukUzunlugu, int kutle, int yas, double boy) {
        super(kutle, yas, boy);
        this.kuyrukUzunlugu = kuyrukUzunlugu;
    }

    public int getKuyrukUzunlugu() {
        return kuyrukUzunlugu;
    }

    public void setKuyrukUzunlugu(int kuyrukUzunlugu) {
        this.kuyrukUzunlugu = kuyrukUzunlugu;
    }

    @Override
    public String toString() {
        return super.toString() + " Kopek{" + "kuyrukUzunlugu=" + kuyrukUzunlugu + '}';
    }

}
