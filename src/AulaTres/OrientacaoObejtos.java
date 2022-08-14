package AulaTres;

public class OrientacaoObejtos {
    int codigo;
    String descricao;
    double preco;

    public void atualizaPreco( double porcentagem){
        preco = preco+porcentagem/100;
    }
}
