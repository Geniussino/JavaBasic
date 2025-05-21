package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative {

    @Test
    public void testMetod() {
//        verificareNumar(5);
//        verificareNumar(2);
//        verificareNumarParImparPositivNegativ(-5);
//        verificareNumarParImparPositivNegativ(-4);
//        verificareNumarParImparPositivNegativ(7);
//        verificareNumarParImparPositivNegativ(2);
//        verificareNumarParImparPositivNegativ(0);

       // System.out.println("Evaluarea elevului este: " + evaluareNota('B'));
        System.out.print("Evaluarea elevului este: ");
        evaluareNota('B');
    }
    //structura de control "if" este folosita pentru a evolua o conditie booleana si pentru a executa un bloc de cod daca conditia este adevarata
    //if(conmditie){
    // bloc de cod ce o sa fiew executat daca conditia este adevarata
    // } else{
    // bloc de cod care o sa fie executat daca conditia este falsa
    // }

    public void verificareNumar(int numar) {
        if (numar > 3) {
            System.out.println("Numarul: " + numar + " este mai mare decat 3");
        } else {
            System.out.println("Numarul: " + numar + " este mai mic decat 3");
        }
    }

    public void verificareNumarParImparPositivNegativ(int valoare) {
        if (valoare > 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul: " + valoare + " este par si pozitiv");
            } else {
                System.out.println("Numarul: " + valoare + " este impar si pozitiv");
            }
        } else if (valoare < 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul: " + valoare + " este par si negativ");
            } else {
                System.out.println("Numarul: " + valoare + " este impar si negativ");
            }
        } else {
            System.out.println("Numarul: " + valoare + " este zero");
        }
    }


//switch este o structura de control care permite evaluarea unei expresii unuia din mai multe blocuri de cod
// switch este folosit cand sunt mai multe cazuri posibile si fiecare caz este asociat unio bloc de cod specific
// switch(expresia){
//      case valoreaUnu :
//      bloc de cod pentru cazul in care expresia are valoarea --> valoreaUnu
//      break;
//      case valoareDoi
//      bloc de cod pentru cazul in care expresia are valoarea --> valoreaDoi
//       break;
//       alte cazuri posibile
//       default :
//       bloc de cod care se executa daca niciunu dintre cazuri nu se potriveste.
// }

    //de transformat in metoda void
//    public String evaluareNota(char nota){
//        return switch (nota){
//            case 'A' -> "Excelent";
//            case 'B' -> "Foarte bine";
//            case 'C' -> "Bine";
//            case 'D' -> "Satisfacator";
//            case 'F' -> "Repetent";
//            default -> "Unknown";
//        };
    public void evaluareNota(char nota) {
        switch (nota) {
            case 'A' -> System.out.println("Excelent");
            case 'B' -> System.out.println("Foarte bine");
            case 'C' -> System.out.println("Bine");
            case 'D' -> System.out.println("Satisfacator");
            case 'F' -> System.out.println("Repetent");
            default -> System.out.println("Unknown");
        }
    }
    }

