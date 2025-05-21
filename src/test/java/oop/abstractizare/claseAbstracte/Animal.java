package oop.abstractizare.claseAbstracte;

public abstract class Animal {
     private String culoare;
     private String nume;
     private int greutate;
// declaram o metoda abstracta
     public abstract void mananca();
     public abstract void infoAnimal();

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }
    public void doarme(){
        System.out.println("Toate animalele au nevoe de somn.");
    }
}
