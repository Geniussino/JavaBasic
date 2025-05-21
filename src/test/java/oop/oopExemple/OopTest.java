package oop.oopExemple;

import org.testng.annotations.Test;

public class OopTest {
    @Test
    public  void oopExempleTest(){
        System.out.println("==== Exemplu student =====");
        Student Ionel = new Student("Popescu", "Ionel", 20, "Facultate de constructii",
                "Resistenta materialelor", true);
//
//        Ionel.mananca();
        Ionel.invata(6);
        Ionel.invata("OOP");

        System.out.println("==== Exemplu angajat =====");
        Angajat Teodor = new Angajat("Ionescu", "Teodor", 30, "Oracle",
                7500.00,4 );
//        Teodor.infoAngajat();
//        Teodor.setSalariu(3500.00);
//        Teodor.infoPersoana();
//        Teodor.infoAngajat();
//        Teodor.mananca();
        Teodor.marire("Senior");
        Teodor.marire("prima de craciun", 3000);
        Teodor.marire(15.75);
    }
}
