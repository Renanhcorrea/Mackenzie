package AulaSete;

public class ProdutoPerecivel extends Produto{
    int validade;

    ProdutoPerecivel (String nome, int quantidade, double preco, int validade){
        super(nome, quantidade, preco);
        this.validade = validade;
    }

    public void retiraEstoque (int quantidadeItem){
        if (quantidade >= quantidadeItem || validade > 2){
            quantidade -= quantidadeItem;
        }
        else
            quantidade = 0;
    }

    public void entraEstoque (int quantidadeItem){
        if (quantidade == 0){
            quantidade += quantidadeItem;
        }
    }

    public String toString (){
        return super.toString() + "\n" + validade;
    }

}
