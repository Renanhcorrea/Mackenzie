package AulaSete;

public class Mensalidade extends Funcionario {
    double salMensal;

    Mensalidade (String nome, String sobrenome, int numFunc, double salMensal){
        super(nome, sobrenome, numFunc);
        this.salMensal = salMensal;
    }

    void calcSalario(int falta){
        salario = salMensal - (salMensal*0.02*falta);
    }

    @Override
    public String toString(){
        return  super.toString()+ "\nSalário Mensal: " + salMensal;
    }

}
