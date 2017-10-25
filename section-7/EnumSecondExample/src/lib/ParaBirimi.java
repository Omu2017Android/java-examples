package lib;

/**
 *
 * @author sentinel
 */
public enum ParaBirimi {

    TURKIYE ("TRL", "Türk Lirası"),
    INGILTERE ("GBP", "İngiliz Sterlini"),
    AMERIKA ("USD", "Amerikan Doları"),
    ALMANYA ("EUR", "Alman Euro'su");

    private final String kisaltma;
    private final String birimAdi;

    ParaBirimi(String kisaltma, String birimAdi) {
        
        this.kisaltma = kisaltma;
        this.birimAdi = birimAdi;
    }
    
    public String getKisaltma() {
        return kisaltma;
    }
    
    public String getBirimAdi() {
        return birimAdi;
    }
}
