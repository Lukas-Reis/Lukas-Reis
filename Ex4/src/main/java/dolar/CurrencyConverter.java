package dolar;


public class CurrencyConverter {  //Classe principal

    // Declaração de variaveis
    public double dollarprice;
    public double dollarbought;
    public double tax = 0.06;

    public double Convert (){
        return (dollarprice*dollarbought)*(1.0+tax);

    }




}
