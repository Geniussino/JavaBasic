package oop.abstractizare.interfete;

public class SpalatorDeVase implements CurataInterface{
    @Override
    public void curataMasa(int numarMasa) {
        System.out.println("Spalatorul de vase primeste vasele");
    }

    @Override
    public void spalaVase() {
        System.out.println("Spalatorul de vase spala toate vasele primite");
    }
}
