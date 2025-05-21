package oop.oopExemple;

public class Student extends Person {
    public String facultate;
    public String cursuri;
    public boolean bursa;

    public Student(String nume, String prenume, Integer varsta, String facultate, String cursuri, boolean bursa) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.cursuri = cursuri;
        this.bursa = bursa;
    }
    public void infoStudent(){
        System.out.println("Studentul "+ getNume() + " este student la facltatea " + facultate);
        System.out.println("Studentul "+ getPrenume() + " are cursuri de " + cursuri);
        System.out.println("Varsta studentului "+ getNume() + " " + getPrenume() + " este de " + getVarsta() + " si are/nu are bursa " + bursa);
    }
    //polimorfrism dinamic - a doua implementare
    public void mananca(){
        System.out.println("Studentul mananca cand primeste pachet de acasa");
    }
    public void invata(String cursul){
        System.out.println("Studentul invata doar in perioada sesiunilor pentru cursul " + cursul);
    }
    public void invata(int timp){
        System.out.println("Studentul invata cel putin " + timp + " ore pe zi.");
    }
}
