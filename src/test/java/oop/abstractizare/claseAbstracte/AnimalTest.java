package oop.abstractizare.claseAbstracte;

import org.testng.annotations.Test;

public class AnimalTest {
    @Test
    public void testMetods(){
        Elefant Dumbo = new Elefant();
        Dumbo.infoAnimal();
        Dumbo.mananca();
        Dumbo.doarme();

        Aligator Crocco = new Aligator();
        Crocco.mananca();
        Crocco.setNume("Crocco");
        Crocco.setCuloare("Verde");
        Crocco.setGreutate(60);
        Crocco.infoAnimal();
        Crocco.doarme();

        Dinozaur Rex = new Dinozaur();
        Rex.setNume("Rex");
        Rex.setCuloare("verde deschis zebrat cu verde inchis");
        Rex.setGreutate(3500);
        Rex.mananca();
        Rex.infoAnimal();
        Rex.doarme();
        //clasa abstracta nu se poate instantia
//        Animal Animal = new Animal;
    }
}
