package lib;

/**
 *
 * @author sentinel
 */
public class Araba {

    private Motor motor;

    public Araba(Motor motor) {
        this.motor = motor;
    }

    public void calistir() {
        motor.ac();
    }

    public void durdur() {
        motor.kapa();
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        System.out.println("Aracin motoru " + this.motor.getClass().getSimpleName()
                + " dan " + motor.getClass().getSimpleName() + " a degistirildi.");
        this.motor = motor;
    }

}
