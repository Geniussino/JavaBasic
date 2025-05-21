package oop.polimorfism.polimorfismStatic;

import org.testng.annotations.Test;

public class CalculeTest {

    @Test
    public void testAdunare(){
        Calcule adunarePolimorfism = new Calcule();
        System.out.println("Adunarea a doua int este: " + adunarePolimorfism.adunare(3, 4));
        System.out.println("Adunarea a doua double este: " + adunarePolimorfism.adunare(3.15,4.12));
        System.out.println("Adunarea a doua double este: " + adunarePolimorfism.adunare("Buna ","seara"));
    }
}