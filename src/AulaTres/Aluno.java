// Aula 03 - Mackenzie

package AulaTres;

public class Aluno {

    public String nome;
    public double notaMatematica, notaFisica, media;

    public double calcularMedia (){
        media = (notaMatematica+notaFisica)/2;
        return media;
    }

    public String verificaStatus(){
        if (media>6)
            return "Aprovado";
        else
            return "Reprovado";
    }
}
