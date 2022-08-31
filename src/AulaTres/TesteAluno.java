// Aula 03 - Mackenzie

package AulaTres;

import java.util.Scanner;

public class TesteAluno {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno alunoUm = new Aluno();

        System.out.println("Nome do aluno: ");
        alunoUm.nome = input.nextLine();
        System.out.println("Nota Matematica: ");
        alunoUm.notaMatematica = input.nextDouble();
        System.out.println("Nota Fisica: ");
        alunoUm.notaFisica = input.nextDouble();

        alunoUm.calcularMedia();
        System.out.printf("O aluno %s tirou %2.2f em Matemática e %2.2f em Fisica \n", alunoUm.nome, alunoUm.notaMatematica, alunoUm.notaFisica);
        System.out.println("Aluno " +alunoUm.verificaStatus() + " com média " + alunoUm.media);
    }
}
