package oop.oopExemple;

public class Person {
    //oop=programare orientata pe obiecte
    //4 principii importante: mostenire, incapsulare, polimorfism si abstractizare

    //Mostenirea in Java este conceputul prin care o clasa (clasa copil) mosteneste o alta clasa (parinte)
    //in momentul in care o clasa mosteneste alta clasa , clasa copil are visibilitate asupra variabilelor/metodelor din clasa parinete
    //in Java se poate mopsteni o singura clasa cu ajutorul cuvantului cheie "extends"
    //in momentul in care o clasamosteneste o alta clasa, clasa copil apeleaza constructorului din parinete
    //si constructorul din clasa parinete spre copil, se apeleaza cu cuvantul cheie "super"

    //Incapsularea = procesul prin care tinem private anumite informatii in asa fel incat acestea sa nu poata fii modificata
    //Ca sa putem face informatiile private, vom face variabilele/metodele din "public" in "private"
    //Modificator de acces:
    //public = codul se poate accesa de oriunde si din orice clasa
    //private = codul se poate accesa doar din clasa de unde s-a scris codul
    //protected = codul se poate accesa doar din pachetul de unde s-a scris codul dar si de subclase(conceptul de mostenire din OOP)
    //default (nu se vede) = codul se poate accesa doar din pachetul de unde s-a scris codul
    //ca sa extragem/modificam o valoare unei variabile private, ne folosim de metodele get/set (getter/setter)

    //polimorfism static
    //polimorfism dinamic

    private String nume;
    private String prenume;
    private Integer varsta;

    public Person(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }
    public void infoPersoana(){
        System.out.println("Numele persanei este: " + nume);
        System.out.println("Prenumele persanei este: " + prenume);
        System.out.println("Varsta persanei este: " + varsta);
    }
    //polimorfism dinamic - prima implementare a metodei
    public void mananca(){
        System.out.println("Persoana mananca de plictiseala");
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    //abstractizarea este procesul de reducere a complecsitatii prin ascunderea detaliilor de implementare si expunerea doar a funtionalitatii
    //se realizeaza prin clase asbracte si/sau interfete

    //clasele abstracte se declara folosind cuvantul abstract
    //pot contine atat metode abstracte (fara corp sau implementare) cat si metode concrete (metodele obtinute, cu immplementare
    //nu se poate face un obiect din clasa abstracta
    //Poate fii utilizata ca super-clasa, pentru alte clase, care extind clasa abstracta si poate avea variabile si atribute ca si o clasa normala

}
