package AulaQuatro;

public class TestaProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto(1234, "Camisa");
        p1.preco = 1000.00;
        p1.atualizaPreco(10);
        System.out.printf("\nCódigo: %d\nDescrição: %s\nPreco: %.2f", p1.codigo, p1.descricao, p1.preco);
    }
}
