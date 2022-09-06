package AulaQuatro;

public class Produto {
    int codigo;
    String descricao;
    double preco;

    // construtor default
    /*
    Produto (int cod){
        codigo = cod;
    }
     */

    // construtor personalizado
    Produto (int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public void atualizaPreco (double porcentagem){
        preco = preco + preco*porcentagem/100;
    }

}
