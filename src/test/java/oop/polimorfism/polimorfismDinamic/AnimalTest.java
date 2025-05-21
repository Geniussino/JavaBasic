package oop.polimorfism.polimorfismDinamic;

import org.testng.annotations.Test;

public class AnimalTest {
    @Test
    public void sunetAnimale(){
        Caine Azorel = new Caine();
        Azorel.scoateSunet();

        Pisica Bella = new Pisica();
        Bella.scoateSunet();
    }
}
