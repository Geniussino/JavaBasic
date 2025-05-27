package homework;

import org.testng.annotations.Test;



public class TestTelefon {
        @Test
        public void testTelefon() {
            // Creez un obiect de tip Smartphone
            Smartphone samsung = new Smartphone("Samsung", "Galaxy S24", "Albastru", "Android");

            // Testez metodele: mostenire, abstractizare, polimorfism
            samsung.porneste();                       // implementare specifica
            samsung.conecteazaLaWiFi("HomeNetwork");  // interfata
            samsung.conecteazaLaBluetooth("Casti Jabra");
            samsung.opreste();                     // metodă moștenită

            // Testez încapsularea
            samsung.setSistemOperare("Android 15");
            System.out.println("Sistem de operare: " + samsung.getSistemOperare());

            // Testez getter pentru culoare
            System.out.println("Culoare telefon: " + samsung.getCuloare());
        }
    }
