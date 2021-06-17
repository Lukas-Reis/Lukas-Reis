package entites;

public class Employee {

    //Definindo Varivaeis (Atributos da classe)

    public String name;
    public double grossSalary;
    public double percentage;
    public double tax;

    //Definindo Métodos

    public double netSalary() {
        return grossSalary-tax;
    }

    //Não returnará nada mas fará algo(Aumento de Salario)

    public double increaseSalary() {
      return netSalary() + (grossSalary*percentage/100);

    }

      public String toString() {
          return name + ", $ " + String.format("%.2f", increaseSalary());
      }

}

//grossSalary += grossSalary*percentage/100.0;
//  +"\n"+
       //   name + ", $ " + String.format("%.2f", increaseSalary());








