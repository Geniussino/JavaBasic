package oop.abstractizare.interfete;

//Interfata este un protocol per care clasa trebe sa-l implementeze (ofera raspuns la lipsa mosteniri multiple)
// o clasa poate mosteni mai multe interfete
//Interfata contine doar metode abstracte
// la versiunile mai vechi de java, interfata poate contine si metode cu implementare dar pot sa ai 2 tipuri de metode (default: public void)
//ai cuvantul chee interface
//Putem sa mostenim o interfata cu cuvantul implements

public class Bucatar implements GatesteInterface{

    @Override
    public void pregatesteMancarea(String tipDeMancare) {
        System.out.println("Bucatarul primeste comanda de " + tipDeMancare);
    }
}
