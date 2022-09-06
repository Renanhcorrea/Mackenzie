package AulaQuatro;

public class Funcionario {
    String nome;
    double salario;

    Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public double calculaImposto(){
        //salario = salario + salario*0.05;
        return (salario*0.05);
    }

}
