package lib;

/**
 *
 * @author sentinel
 */
public class Pegasus extends Hayvan implements At, Kus{
    
    public Pegasus(String isim, int yas) {
        super(isim, yas);
    }

    @Override
    public void atSesiCikar() {
        System.out.println("At sesi...");
    }

    @Override
    public void kusSesiCikar() {
        System.out.println("Kus sesi...");
    }

    @Override
    public void kanatCirp() {
        System.out.println("Kanat cirpiyor!");
    }

    @Override
    public String toString() {
        return "Pegasus{" + super.toString() + '}';
    }
}
