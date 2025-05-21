package structuriRepetitive;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StructuriRepetitive {
    @Test
    public void tsstMetod() {
//    colegiDeCursArray();
//    colegiDeCurs();
        afisareHashMap();
        afisareHashMap2();
    }
// in Java un array (multime) este o structura de date care stocheaza o colectie de elemente de acelasi tip
// fie primitive, fie obiect.
// - Dimensiunea este fixa si o data creat, dimensiunea nu se mai poate schimba
// -elementele trebue sa fie de acelasi tip si accesul la elemente se4 face prin indexul acestora.

    public void colegiDeCursArray() {
        //cream o multime de stringuri
        String[] colegi = new String[6];
        colegi[0] = "Marius";
        colegi[1] = "Eugen";
        colegi[2] = "Hilda";
        colegi[3] = "Gigi";
        colegi[4] = "Hilda";
        colegi[5] = "Sinziana";

        System.out.println("Exemplu multimi");
        // "for" este o structura de control utilizata pt a itera o secventa de instructiuni sau pt a parcurge un anumit interval de valori
        for (int index = 0; index < colegi.length; index++) {
            System.out.println("Numele colegului de la numarul: " + index + " este " + colegi[index]);
        }

    }

    public void colegiDeCurs() {
        //listele sunt o colectie ordonata de elemente de acelasi tip
        //elementele sunt stocate in ordinea in care sunt adaugate
        //Accesarea se face tot prin index
        //elementele unei liste pot fi parcurse folosind bucle sau iteratori
        //in liste sunt permise elemente duplicate
        //in Java sunt mai multe clase care implementeaza listele, cele mai comune sunt ArrayList si LinkedList

        //Exemplu
        List<String> colegiLista = new ArrayList<>();
        colegiLista.add("Maria");
        colegiLista.add("Demetra");
        colegiLista.add("Petronela");
        colegiLista.add("Gabriel");
        colegiLista.add("Adrian");

        //while este o structura de control utilizata pt a executa repetat un bloc de cod atata timp cat o anumita conditie este adevarata

        int index = 0;
        while (colegiLista != null) {
            System.out.println("Numele colegului de la numarul: " + index + " este " + colegiLista.get(index));
            index++;
        }
    }

    public void afisareHashMap() {
        //Hasmat ofera o implementare a unei colectii de tip pereche (cheie-valoare)
        //intr-un hashmap cheile sunt unice, nu pot exista duplicate, fiecare cheie poate fi asociata cu cel mult o valuare

        HashMap<String, String> categorieObiecte = new HashMap<>();
        categorieObiecte.put("fructe", "mar");
        categorieObiecte.put("animale", "urs");
        categorieObiecte.put("flori", "liliac");

        System.out.println("Exemplu Hashmap");

        //
        //
        //Sintaxa:
        // for/foreach(tip element numeElement : colectia){
        // bloc de cod executat pentru fiecare element din colectie
        // }
        for (String key : categorieObiecte.keySet()) {
            System.out.println("Categoria este " + key + ". Valoarea este " + categorieObiecte.get(key) + ".");
        }

    }

    public void afisareHashMap2() {
        System.out.println("Exemplu Hashmap2");
        HashMap<String, List<String>> tariOrase = new HashMap<>();

        //adaugam 3 seturi de liste pe care le vom folosi in hashmap
        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Timisoara");
        oraseRomania.add("Clus");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Bucuresti");
        oraseSpania.add("Timisoara");
        oraseSpania.add("Clus");

        List<String> oraseAmerica = new ArrayList<>();
        oraseAmerica.add("Bucuresti");
        oraseAmerica.add("Timisoara");
        oraseAmerica.add("Clus");

        //adaugam valorile in hashmat
        tariOrase.put("Romania", oraseRomania);
        tariOrase.put("Spania", oraseSpania);
        tariOrase.put("America", oraseAmerica);

        for (String key : tariOrase.keySet()) {
            System.out.println("Tara este " + key + ". Orasele sunt " + tariOrase.get(key) + ".");
        }
    }
}