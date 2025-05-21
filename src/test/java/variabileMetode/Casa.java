package variabileMetode;

import org.testng.annotations.Test;

//1 - O clasa Casa
public class Casa{

    //2	- Min 3 variabile globale
    String cityOfResidence = "Timisoara"; //orasul locuintei
    String addressOfResidence = "Strada Ana Ipatescu 155"; //adresa locuintei
    char typeOfResidence = 'A'; //A = apartament , H = home , P = penthouse
    int numberOfRooms = 2; //
    int numberOfBathrooms = 1;

    // 4.1 - 2 metoda void - fara parametri
    public void displayHouseInfo() {
        System.out.println("City of Residence: " + cityOfResidence);
        System.out.println("Address: " + addressOfResidence);
        System.out.println("Type of Residence: " + typeOfResidence);
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Number of Bathrooms: " + numberOfBathrooms);
    }

    // 4.2 - metoda void - cu parametri
    // this. este un keyword special în Java si este folosit pentru a face referire la variabilele și metodele
    // instanței curente.Ajută la diferențierea dintre variabilele de instanță și parametrii metodei si se
    // poate folosi pentru a transmite instanța curentă unei alte metode.
    //sursa: amintiri din copilarie (facultate)+google pentru un refresh
    public void updateHouseInfo(String city, String address, char type, int rooms, int bathrooms) {
        this.cityOfResidence = city;
        this.addressOfResidence = address;
        this.typeOfResidence = type;
        this.numberOfRooms = rooms;
        this.numberOfBathrooms = bathrooms;
    }

    // 5.1	- metoda cu return - fara parametri
    public String getHouseType() {
        if (typeOfResidence == 'A') return "Apartment";
        else if (typeOfResidence == 'H') return "House";
        else if (typeOfResidence == 'P') return "Penthouse";
        else return "Unknown";
        // //sau folosind functia switch
//        return switch (typeOfResidence) {
//                    case 'A' -> "Apartment";
//                    case 'H' -> "House";
//                    case 'P' -> "Penthouse";
//                    default -> "Unknown";
//        };
    }

    // 5.2	- metoda cu return - cu parametri
    public int totalRoomsIncludingBathrooms(int extraRooms) { //am initializat si o variabila pentru pod/camara/pivnita/bucatarie/garage/etc
        return numberOfRooms + numberOfBathrooms + extraRooms;
    }
//6 - 1 metoda de test - afisare in consola toate variabilele si metodele facute
@Test

    public void testHouseMethods() {
       // String initialCity = cityOfResidence;
        int totalRoomsBeforeUpdate = numberOfRooms + numberOfBathrooms; //3.1 - Min 3 variabile locale in oricare metoda
        String houseTypeBeforeUpdate = getHouseType();

        System.out.println("--- Initial House Info ---");
        displayHouseInfo();

        System.out.println("\n---Updating House Info---"); // \n este un caracter special care reprezintă un newline (linie nouă).
        updateHouseInfo("Bucharest", "Calea Victoriei 10", 'H', 4, 2);
        displayHouseInfo();

        System.out.println("\nHouse Type: " + getHouseType());
        System.out.println("Total Rooms, Including Extra: " + totalRoomsIncludingBathrooms(2));

        int totalRoomsAfterUpdate = totalRoomsIncludingBathrooms(2); //3.2 - Min 3 variabile locale in oricare metoda
        String houseTypeAfterUpdate = getHouseType(); //3.3	- Min 3 variabile locale in oricare metoda

        System.out.println("\nBefore Update: House Type was " + houseTypeBeforeUpdate + ", Total Rooms: " + totalRoomsBeforeUpdate);
        System.out.println("After Update: House Type is now " + houseTypeAfterUpdate + ", Total Rooms: " + totalRoomsAfterUpdate);
    }

    public static void main(String[] args) {
        Casa myHouse = new Casa();
        myHouse.testHouseMethods();
    }
}
