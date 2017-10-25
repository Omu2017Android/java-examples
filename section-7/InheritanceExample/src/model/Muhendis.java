package model;

/**
 *
 * @author sentinel
 */
public class Muhendis extends Calisan{
    
    private int bonusMaas;
    
    public Muhendis(String ad, String soyad, int maas, int bonusMaas) {
        super(ad, soyad, maas);
        this.bonusMaas = bonusMaas;
    }

    public int getBonusMaas() {
        return bonusMaas;
    }

    public void setBonusMaas(int bonusMaas) {
        this.bonusMaas = bonusMaas;
    }

    @Override
    public int getMaas() {
        return maas + bonusMaas;
    }

    @Override
    public void setMaas(int maas) {
        this.maas = maas + bonusMaas;
    }

    @Override
    public String toString() {
        return super.toString() + "Muhendis{" + "bonusMaas=" + bonusMaas + '}';
    }
    
}
