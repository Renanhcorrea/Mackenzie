package AulaTres;

public class TestOO extends OrientacaoObejtos {
    public static void main(String[] args) {
        OrientacaoObejtos p1 = new OrientacaoObejtos();
        System.out.printf("\nCodigo: %d\nDescrição: %s\nPreço: %.2f", p1.codigo, p1.descricao,p1.preco);
        System.out.println();

        p1.codigo= 1234;
        p1.descricao = "Camisa";
        p1.preco = 100.00;
        p1.atualizaPreco(5);

        System.out.printf("\nCodigo: %d\nDescrição: %s\nPreço: %.2f", p1.codigo, p1.descricao,p1.preco);
        System.out.println();

        OrientacaoObejtos p2 = new OrientacaoObejtos();

        p2.codigo = 2345;
        p2.descricao = "Calça";
        p2.preco = 200.00;
        p2.atualizaPreco(10);

        System.out.printf("\nCodigo: %d\nDescrição: %s\nPreço: %.2f", p2.codigo, p2.descricao,p2.preco);
    }
}
