package AulaDois;

import java.util.Scanner;

public class VetorExemplo {
    public static void main(String[] args) {
        int [] idade = new int [3];
        int [] peso = new int[3];
        float [] altura = new float[3];
        int soma = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i<idade.length; i++){
            System.out.println("Idade:");
            idade[i] = input.nextInt();
            System.out.println("Peso:");
            peso[i] = input.nextInt();
            System.out.println("Altura:");
            altura[i] = input.nextFloat();
        }
        for (int num:idade){
            soma+=num;
        }
        System.out.println("Media das idades: "+ (double) soma/idade.length);
    }
}
