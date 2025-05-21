package oop.oopExemple;

public class Angajat extends Person{

    public String companie;
    public Double salariu;
    public Integer experientaInDomeniu;

    public Angajat(String nume, String prenume, Integer varsta, String companie, Double salariu, Integer experientaInDomeniu) {
        super(nume, prenume, varsta);
        this.companie = companie;
        this.salariu = salariu;
        this.experientaInDomeniu = experientaInDomeniu;
    }
    public void infoAngajat(){
        System.out.println("Angajatul " + getNume() + " lucreaza la compania " + companie);
        System.out.println("Angajatul " + getPrenume() + " are salariul de  " + salariu + " Ron.");
        System.out.println("Varsta angajatului este de " + getVarsta() + " lucreaza la compania " + companie);
    }
    public void mananca(){
        System.out.println("Angajatul mananca cand are pauza de masa sau pe tastatura");
    }

    public void marire (String grad){
        System.out.println("Angajatul este promovat la gradul de " + grad);
    }
    public void marire (double procent){
        System.out.println("Angajatul primeste o marire de " + procent + "%");
    }
    public void marire (String prima, int suma){
        System.out.println("Angajatul primeste o " +prima+ " cu valoare de " + suma);
    }
    public void setCompanie(String companie) {
        this.companie = companie;
    }

    public void setSalariu(Double salariu) {
        this.salariu = salariu;
    }

    public void setExperientaInDomeniu(Integer experientaInDomeniu) {
        this.experientaInDomeniu = experientaInDomeniu;
    }
}
