package AulaQuatro;

import java.util.Scanner;

public class TestaFuncionario {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        Funcionario fun1 = new Funcionario("Daiane", 2000 );
        System.out.println("Nome: "+ fun1.nome);
        System.out.println("Salario: "+ fun1.salario);
        System.out.println("Valor do imposto: "+ fun1.calculaImposto());

    }
}
