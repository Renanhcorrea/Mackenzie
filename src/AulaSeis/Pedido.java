package AulaSeis;

public class Pedido  {
    int numero;
    int quantidade;
    double valor = 0;
    Produto item;

    Pedido (int numero, Produto item, int quantidade){
        this.numero = numero;
        this.quantidade = quantidade;
        this.item = item;
    }

    public String toString(){
        calculaPedido();

        return  "Número do pedido:" + numero + "\nCódigo do Produto: " + item.cod +
                "\nDescrição: " + item.descricao +
                "\nPreço do Produto: "+ item.preco + "\nQuantidade: "+ quantidade+
                "\nValor total do pedido: "+ valor;
    }

    public void calculaPedido() {
        valor = quantidade * item.preco;
    }
}