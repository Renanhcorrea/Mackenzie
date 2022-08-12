package AulaUm;

import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double notaUm, notaDois, notaTres, media;
        System.out.println("Primeira nota: ");
        notaUm = input.nextDouble();
        System.out.println("Segunda Nota: ");
        notaDois = input.nextDouble();
        System.out.println("Terceira nota: ");
        notaTres = input.nextDouble();

        media = (notaUm+notaDois+notaTres)/3;
        System.out.println("AulaUm.Media: " + media);
        if (media<=5)
            System.out.println("Reprovado");
        else
            System.out.println("Aprovado");
    }
}
