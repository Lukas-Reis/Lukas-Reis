package entities;

public class Employee {

    //Definindo Varivaeis (Atributos da classe)

     public String name;
     public double grossSalary;
     public double tax;

     //Definindo Métodos

     public double netSalary() {
         return grossSalary-tax;
     }

     //Não returnará nada mas fará algo(Aumento de Salario)
     public void increaseSalary(double percentage){

         grossSalary += grossSalary*percentage/100.0;
     }

     public String toString() {
         
         return name + ", $ " + String.format("%.2f", netSalary());
     }

}
