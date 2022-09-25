package AulaSeis;

public class Cliente {
    String nome, cpf;
    int agencia;
    Poupanca ctaPoupanca;  // associação agregação
    Corrente ctaCorrente = new Corrente(); //associação composição

    Cliente (String nome, String cpf, int agencia){
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = agencia;
    }

    public void abrirPoupanca(Poupanca conta){
        ctaPoupanca = conta;
    }
}
