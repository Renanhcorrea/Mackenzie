package AulaSeis;

public class Pedido {
    int numero;
    int quantidade;
    double valor;
    Produto item;

    Pedido (int numero, int quantidade, Produto item){
        this.numero = numero;
        this.quantidade = quantidade;
        item = new Produto ();
    }

    public void calculaPedido (double preco){
        valor = preco * quantidade;
    }

}
