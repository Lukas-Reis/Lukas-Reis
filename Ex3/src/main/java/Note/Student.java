package Note;

public class Student {

    //Declaração de Atributos das Variaveis
    public String name;
    public double n1,n2,n3;
    public double soma;
    public double subtraction;
    public String resposta;

   //Drclaração dos métodos
    public double Summation (){
        soma = n1+n2+n3;
        return soma;

    }

    public double Subtraction (){
        subtraction = 60 - Summation();

        return subtraction;
    }

public boolean Check() {
        if (Summation() >= 60) {
            return true;
        }else if(Summation() <= 60){
            return  false;
        }else{
            return false;
        }

}

    public String toString() {
        if (Check()) {
            return Summation() + " PASS";
        } else {
            return Summation() + " NOT PASS " + " MISSING " + Subtraction() + " POINTS ";
        }

    }
}

