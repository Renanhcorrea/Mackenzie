package AulaSete;

public class Funcionario {
    protected String nome;
    protected String sobrenome;
    protected int numFunc;
    double salario;

    Funcionario (String nome, String sobrenome, int numFunc){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numFunc = numFunc;
    }

    public String toString(){
        return "Número do Funcionario: " + numFunc +
                "\nNome: " + nome + " " + sobrenome +
                "\nSalario a pagar: "+ salario;
    }
}
