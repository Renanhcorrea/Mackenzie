package AulaCinco;

public class Produto {
    int codigo;
    String descricao;
    double preco;
    int quantidade;

    public void setPreco (double preco){
        this.preco = preco;
    }

    public void setQuantidade (int quantidade){
        this.quantidade = quantidade;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double calculaValor(){
        return (preco*quantidade);
    }
}
