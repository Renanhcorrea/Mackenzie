package AulaDois;

import java.util.Scanner;
public class AplicandoConhecimento {
    public static void main(String[] args) {

        int[] vet = new int[10];
        int[] positivo = new int[10];
        int x = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < vet.length; i++)
            vet[i] = input.nextInt();

        x = vetor_positivos(vet, positivo);

        for (int i = 0; i < x; i++)
            System.out.println(positivo[i]);
    }
    public static int vetor_positivos(int[] vet, int[]  positivo) {
        int x = 0;
        for (int i = 0; i < vet.length ; i++) {
            if (vet[i] > 0)
                positivo[x++] = vet[i];
        }
        return x;
    }
}
