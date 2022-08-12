package AulaUm;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numeroUm, numeroDois;
        int codigo;

        while (true) {
            System.out.println("Escolhe uma opcao:");
            System.out.println("1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão\n5- Sair");
            codigo = input.nextInt();

            if (codigo == 5)
                break;

            if (codigo < 1 || codigo > 6) {
                System.out.println("Opção inválida.");
                continue;
            }

            System.out.println("Primeiro número:");
            numeroUm = input.nextDouble();
            System.out.println("Segundo número:");
            numeroDois = input.nextDouble();

            switch (codigo){
                case 1:
                    System.out.println("Soma = "+ (numeroUm+numeroDois));
                    break;
                case 2:
                    System.out.println("Subtração = "+ (numeroUm-numeroDois));
                    break;
                case 3:
                    System.out.println("Multiplicação = "+ (numeroUm*numeroDois));
                    break;
                case 4:
                    if (numeroDois == 0)
                        System.out.println("NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO");
                    else
                        System.out.println("Divisão = "+ (numeroUm/numeroDois)); // aluno irá implementar na questão 2
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }


    }
}

/*

                    PRATICANDO 01 - MACKENZIE

    public static void main(String[] args) {
        double n1, n2;
        int op;
        Scanner entrada = new Scanner (System.in);

        while (true){
            op = entrada.nextInt();
            if (op==5)                                          //sai do while com a opção 5
                break;
            if (op<1 || op>6){                                 //não executa o trecho linha 18 a 36
                System.out.println("Opção do menu inválida");  //e volta ao while
                continue;
            }
            n1 = entrada.nextDouble();
            n2 = entrada.nextDouble();
            switch (op){
                case 1:
                    System.out.println("Soma = " + (n1+n2));
                    break;
                case 2:
                    System.out.println("Subtração = " + (n1-n2));
                    break;
                case 3:
                    System.out.println("Multiplicação = "+ (n1*n2));
                    break;
                case 4:
                    if (n2 == 0)
                        System.out.println("NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO");
                    else
                        System.out.println("Divisão = "+ (n1/n2)); // aluno irá implementar na questão 2
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

    }
}
*/

