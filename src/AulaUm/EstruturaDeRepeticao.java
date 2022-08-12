package AulaUm;

import java.util.Scanner;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Do / While

        int notaUm, notaDois;
        char resp;

        do {
            System.out.println("Digite 2 números:");
            notaUm = input.nextInt();
            notaDois = input.nextInt();
            System.out.println("Soma dos dois numeros: " + (notaUm + notaDois));
            System.out.println("Deseja continuar? (S/N)");
            resp = input.next().charAt(0);
        }   while (resp== 's');
        */

        /*
        while

        int numero, soma = 0, cont = 0;
        double media;
        System.out.println("Digite varios núemros: (-1 encerra)");
        numero = input.nextInt();
        while (numero != -1){
            soma += numero;
            cont++;
            numero = input.nextInt();
        }
        if (cont != 0){
            media = (double)soma/cont;
            System.out.println("Soma dos númeors digitados" + soma);
            System.out.println("AulaUm.Media dos numeros digitados: "+ media);
        }
        else
            System.out.println("Não houve processamento");

         */
        int numero, soma = 0;
        double media;
        System.out.println("Digite 10 números: ");
        for (int i =0; i<10; i++){
            numero = input.nextInt();
            soma+= numero;
        }
        media = (double) soma /10;
        System.out.println("Soma dos números: "+ soma);
        System.out.println("AulaUm.Media dos números: "+  media);
    }
}
