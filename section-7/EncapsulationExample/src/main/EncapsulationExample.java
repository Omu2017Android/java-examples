package main;

import model.Cinsiyet;
import model.Kisi;

/**
 *
 * @author sentinel
 */
public class EncapsulationExample {

    public static void main(String[] args) {
        
        Kisi kisi1 = new Kisi();
        
        kisi1.setAd("Erdem");
        kisi1.setSoyad("Şahin");
        kisi1.setYas(22);
        kisi1.setCinsiyet(Cinsiyet.MALE);
        
        System.out.println("kisi1 Ad: " + kisi1.getAd());
        System.out.println("kisi1 Soyad: " + kisi1.getSoyad());
        System.out.println("kisi1 Yas: " + kisi1.getYas());
        System.out.println("kisi1 Cinsiyet: " + kisi1.getCinsiyet());
    }
    
}
