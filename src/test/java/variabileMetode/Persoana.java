package variabileMetode;

import org.testng.annotations.Test;

public class Persoana {

    // o clasa in Java este o structura ce defineste atat atributele/varibilele cat si metodele unui obiect
    // tipurile de date in Java sunt de 2 feluri:
    // - tipuri de date primitive ---> stocheza direct valoarea >> sunt 8 tipuri de date
    // - byte (8 bits)
    // - short (16 bits)
    // - int (32 bits)
    // long (64 bits)
    // double (numere zecimale)
    // float (numere zecimale, dar precizie mai mica)
    // char (caractere individuale )
    // boolean (valori logice true/false)
    //tipuri de date de referinta (sau ne-primitive), stocheaza doar refenta catre un obiect
    // clasa/interfata/array

    //tipuri de variabile in Java
    // 1 - variabile de instanta (sau variabile globale)
    // 2 - variabile locale (sau variabile din interiorul metodei)

    //o metoda, este un bloc de cod, care indeplineste o functie specifica (actiune/comportament)
    // metode fara return (sau void) >> ruleaza logica din interiuor si nu returneaza nimic
    // modificator de acces (public/proivat/protected) void numeleMetodei (cu/fara parametri){
    // Locica/corpul metodei
    // }
    // metoda cu return >> sa returneze un rezultat
    // modificator de acces (public/proivat/protected) tipulReturnat(int/string) numeleMetodei (cu/fara parametri){
    // Locica/corpul metodei
    // return valoarea de tipulReturnat
    // }

    // declaram variabile de instanta (globale)
    String numelePersoanei = "Popescu";
    String prenumelePersoanei = "Andrei";
    char sexulPersoanei = 'M';
    int anDeNastere = 2000;



    //metoda de test
    @Test //annotarea
    public void afisareVariabileGlobaleTest (){
        System.out.println("Persoana are numele: "+ numelePersoanei);
        System.out.println("Persoana are prenumele: " + prenumelePersoanei);
        System.out.println("Persoana e de sexul: "+ sexulPersoanei);
    }

    @Test
    public void afisareDetaliiPersoana(){
        //declaram niste variabile locale
        double inaltimeaPersoanei = 1.85;
        int varstaPersoanei = 25;
        String adresaPersoanei = "Strada Ana Ipatescu n. 126";
        System.out.println("Detaliile persoanei sunt: ");
        System.out.println("Persoana are numele: "+ numelePersoanei);
        System.out.println("Persoana are prenumele: " + prenumelePersoanei);
        System.out.println("Persoana e de sexul: "+ sexulPersoanei);
        System.out.println("Inaltimea persoanei este: "+ inaltimeaPersoanei);
        System.out.println("Varsta persoanei este: " + varstaPersoanei);
        System.out.println("Adresa persoanei este: "+ adresaPersoanei);
    }

    @Test
    public void afisareDetaliiProfesionbale (){
        System.out.println(calculeazaVarsta(2025));
        System.out.println("Persoana este adulta? " + esteAdult(16));
        System.out.println("Persoana este adulta? " + esteAdult(calculeazaVarsta(2025)));
    }

    public int calculeazaVarsta(int anulActual){
      return anulActual-anDeNastere;
    }

    public boolean esteAdult(int varsta){
        return varsta >= 18;
    }
}
