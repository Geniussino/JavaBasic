package oop.abstractizare.interfete;

import org.testng.annotations.Test;

public class RestaorantTest {
    @Test
    public void activitateRestaorant(){
        Bucatar Ion = new Bucatar();
        Ion.pregatesteMancarea("T-Bones, medium-rare");

        Chelner Petre = new Chelner();
        Petre.primesteComanda(3);
        Petre.servesteMancarea("T-Bones, medium rare", "Eugen");
        Petre.curataMasa(10);

        SpalatorDeVase Codrut = new SpalatorDeVase();
        Codrut.curataMasa(10);
        Codrut.spalaVase();
    }
}
