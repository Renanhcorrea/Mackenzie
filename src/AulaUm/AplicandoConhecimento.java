package AulaUm;

import java.util.Scanner;

public class AplicandoConhecimento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            double numeroUm, numeroDois;
            int codigo;
           // System.out.println("Escolha as opções abaixo: ");
           /* System.out.println("1- média entre os dois números." +
                    "\n2- Diferença do maior pelo menor." +
                    "\n3- Multiplicação dos números digitados." +
                    "\n4- Divisão do primeiro pelo segundo." +
                    "\n5- Sair");
            */
            codigo = input.nextInt();

            if (codigo == 5)
                break;

            if (codigo >=6) {
                System.out.println("OPÇÃO INVÁLIDA");
                continue;
            }

            //System.out.println("Primeiro número:");
            numeroUm = input.nextDouble();
            //System.out.println("Segundo número:");
            numeroDois = input.nextDouble();

            switch (codigo) {
                case 1:
                    System.out.println((numeroUm+numeroDois)/2);
                    break;
                case 2:
                    if (numeroUm>numeroDois)
                        System.out.println(numeroUm-numeroDois);
                    else
                        System.out.println(numeroDois-numeroUm);
                    break;
                case 3:
                    System.out.println(numeroUm*numeroDois);
                    break;
                case 4:
                    if (numeroDois==0)
                        System.out.println("NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO");
                    else
                        System.out.println(numeroUm/numeroDois);
                    break;
                default:
                    break;
            }
        }
    }
}
