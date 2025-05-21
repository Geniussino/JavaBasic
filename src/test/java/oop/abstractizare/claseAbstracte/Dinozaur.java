package oop.abstractizare.claseAbstracte;

public class Dinozaur extends Animal{
    @Override
    public void mananca() {
        System.out.println("Dinozaurul " + getNume() + " mananca elefanti.");
    }

    @Override
    public void infoAnimal() {
        System.out.println("Dinozaurul " + getNume() + " are culoarea " + getCuloare() + " si cantereste " + getGreutate() + "Kg!");
    }
}
