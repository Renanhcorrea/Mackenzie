package AulaSeis;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TesteBanco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cliente cliente1 = new Cliente("Jose", "11122244400", 1234);
        cliente1.ctaCorrente.saldo = 3000; // composiçã
        System.out.println("Nome: "+ cliente1.nome);
        System.out.println("Saldo: "+ cliente1.ctaCorrente.saldo);
        cliente1.ctaCorrente.calculaCredito();
        System.out.println("Credito: "+ cliente1.ctaCorrente.credito);

        //Abrir poupança
        Poupanca poup1 = new Poupanca(56757, 500);
        //Agregacao ao cliente
        cliente1.abrirPoupanca(poup1);
        cliente1.ctaPoupanca.rendimento=0.5;
        cliente1.ctaPoupanca.calculaRendimentos();
        System.out.println("Número da Poupança: "+ cliente1.ctaPoupanca.numero);
        System.out.println("Saldo: "+ cliente1.ctaPoupanca.saldo);

    }
}
