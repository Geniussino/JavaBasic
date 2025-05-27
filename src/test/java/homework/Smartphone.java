package homework;

// Clasa Smartphone mosteneste Telefon si implementeaza Conectivitate
public class Smartphone extends Telefon implements Conectivitate {
    private String sistemOperare;

    // Constructor
    public Smartphone(String brand, String model, String culoare, String sistemOperare) {
        super(brand, model, culoare); // apelez constructorul clasei de baza
        this.sistemOperare = sistemOperare;
    }

    // Getter si setter pentru sistemul de operare
    public String getSistemOperare() {
        return sistemOperare;
    }
    public void setSistemOperare(String sistemOperare) {
        this.sistemOperare = sistemOperare;
    }

    // Implementarea metodei abstracte
    @Override
    public void porneste() {
        System.out.println(getBrand() + " " + getModel() + " porneste cu " + sistemOperare + ".");
    }

    // Polimorfism: implementarea diferită a metodelor din interfață
    @Override
    public void conecteazaLaWiFi(String retea) {
        System.out.println(getModel() + " se conecteaza la rețeaua WiFi: " + retea);
    }

    @Override
    public void conecteazaLaBluetooth(String dispozitiv) {
        System.out.println(getModel() + " se conecteaza la dispozitivul Bluetooth: " + dispozitiv);
    }

    public void opreste() {
        System.out.println(getBrand() + " se opreste dupa 36 de ore de utilizare intensiva.");
    }
}
