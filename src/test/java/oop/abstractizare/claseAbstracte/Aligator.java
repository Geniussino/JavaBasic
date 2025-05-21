package oop.abstractizare.claseAbstracte;

public class Aligator extends Animal{
    @Override
    public void mananca() {
        System.out.println("Aligatorul manca oameni");
    }

    @Override
    public void infoAnimal() {
        System.out.println("Aligatorul are culoarea " + getCuloare() + " se numeste " + getNume() + " si are " + getGreutate() + "kg.");
    }
}
