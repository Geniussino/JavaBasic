package oop.abstractizare.interfete;

public class Chelner implements ServesteeInterface, CurataInterface{
    @Override
    public void curataMasa(int numarMasa) {
        System.out.println("Chelenul curata masa cu numarul "+ numarMasa);
    }

    @Override
    public void spalaVase() {
        System.out.println("Chelenul spala vasele de la mese.");
    }

    @Override
    public void primesteComanda(int numarComanda) {
        System.out.println("Chelenul primeste comanda numarul "+ numarComanda);
    }

    @Override
    public void servesteMancarea(String tipMancare, String numeClient) {
        System.out.println("Chelenul serveste comanda de la clientul "+ numeClient + "si duce delul de mancare: " + tipMancare);
    }
}
