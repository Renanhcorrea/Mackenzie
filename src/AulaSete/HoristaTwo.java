package AulaSete;

public class HoristaTwo extends Funcionario {
    protected int numHoras;
    protected double salHoras;

    HoristaTwo (String nome, String sobrenome, int numFunc, double salHoras, int numHoras){
        super(nome, sobrenome, numFunc);
        this.salHoras = salHoras;
        this.numHoras = numHoras;
    }

    void calcSalario(){
        salario = salHoras * numHoras;
    }

    @Override
    public String toString (){
        return super.toString()+ "\nSalario hora: " +salHoras + "\nHoras trabalhadas: " +numHoras;
    }
}
