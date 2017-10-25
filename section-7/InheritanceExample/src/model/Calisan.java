package model;

/**
 *
 * @author sentinel
 */
public class Calisan {
    
    private String ad;
    private String soyad;
    protected int maas;

    public Calisan(String ad, String soyad, int maas) {
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
    }
    
    public final String getAd() {
        return ad;
    }

    public final void setAd(String ad) {
        this.ad = ad;
    }

    public final String getSoyad() {
        return soyad;
    }

    public final void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return "Calisan{" + "ad=" + ad + ", soyad=" + soyad + ", maas=" + maas + '}';
    }
    
}
