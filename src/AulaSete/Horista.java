package AulaSete;

public class Horista extends Professor{
    protected int horas;
    protected double salHora;

    Horista (String nome, String matricula, int idade, int horas, double salHora){
        super(nome, matricula, idade);
        this.horas = horas;
        this.salHora = salHora;
    }

    public void calculaSalario(){
        super.salarioMensal = horas*salHora;
    }

    public String toString(){
        return super.toString();
    }
}
