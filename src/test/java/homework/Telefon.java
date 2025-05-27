package homework;

// Clasa abstracta definește o structura de baza pentru orice tip de telefon
public abstract class Telefon {
    // de facut un exeplu OOP in care sa se foloseasca: mostenire, incapsulare, polimorfism, abstractizare (atat clase abstracte cat si interfetre)

    private String brand;
    private String model;
    private String culoare;

    public Telefon(String brand, String model, String culoare) {
        this.brand = brand;
        this.model = model;
        this.culoare = culoare;
    }

    // Incapsulare: getter si setter pentru brand, model si culoare
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Implementarea metodei abstracte
    public abstract void porneste();
}
