package oop.abstractizare.claseAbstracte;

public class Elefant extends Animal {
    @Override
    public void mananca() {
        System.out.println("Elefantul manca arahide. ");
    }

    @Override
    public void infoAnimal() {
        System.out.println("Elefantul este cel mai mare mamifer.");
    }
}
