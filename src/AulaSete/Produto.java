package AulaSete;

public class Produto {
    protected String nome;
    protected int quantidade;
    protected double preco;

    Produto (String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void retiraEstoque (int quantidadeItem){
        if (quantidade >= quantidadeItem){
            quantidade -= quantidadeItem;
        }
        else
            System.out.println("Estoque insuficiente.");
    }

    public void entraEstoque (int quantidadeItem){
        quantidade += quantidadeItem;
    }

    public String toString (){
        return "\n" + nome +
                "\n" + quantidade +
                "\n" + preco;
    }
}
