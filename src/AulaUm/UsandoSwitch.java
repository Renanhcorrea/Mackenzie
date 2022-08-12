package AulaUm;

import java.util.Scanner;

public class UsandoSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigo;
        double salario, aumentoSalario = 0, novoSalario;
        String cargo = "";

        System.out.println("Código: ");
        codigo = input.nextInt();
        System.out.println("Salario: ");
        salario = input.nextDouble();

        switch (codigo){
            case 1:
                aumentoSalario = 0.5;
                cargo = "Escrituario";
                break;
            case 2:
                aumentoSalario = 0.35;
                cargo = "Secretario";
                break;
            case 3:
                aumentoSalario = 0.2;
                cargo = "Caixa";
                break;
            case 4:
                aumentoSalario = 0.1;
                cargo = "Gerente";
                break;
        }
        aumentoSalario = salario * aumentoSalario;
        novoSalario = salario + aumentoSalario;

        System.out.printf("Salario Antigo: %.2f \n", salario);
        System.out.printf("Aumento: %.2f \n", aumentoSalario);
        System.out.printf("Novo Salario: %.2f \n", novoSalario);
    }
}
