package AulaSeis;

public class Poupanca {
    int numero;
    double saldo, rendimento;

    Poupanca (int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public void calculaRendimentos(){
        saldo += saldo*rendimento/100;
    }

    public void sacar (double valor){
        if (saldo>=valor){
            saldo-=valor;
        }
        else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void depositar (double valor){
        saldo += valor;
    }

}
