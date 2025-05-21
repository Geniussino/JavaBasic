package obiectConstructor;

public class ContBancar {
    public String numeTitular;
    public Double soldTitular;

    //un constructor parametrizat care verifica sopldul initial
    public ContBancar(String numeTitular, Double soldInitial){
        this.numeTitular = numeTitular;
        //verificam soldul initial
        if(soldInitial >=100){
            this.soldTitular = soldInitial;
        } else {
            System.out.println("Soldul inizial trebue sa fie cel putin 100 RON. Resetam la 0.");
            this.soldTitular = 0.00;
        }
    }
    public void infoCont(){
        System.out.println("Titularul " + numeTitular + " are soldul: " + soldTitular);
    }
}
