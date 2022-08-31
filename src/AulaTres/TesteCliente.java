package AulaTres;

import java.util.Scanner;

public class TesteCliente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cliente c1 = new Cliente();
        c1.agencia = 123;
        //System.out.println("Agencia:");
        //c1.agencia = input.nextInt();
        c1.conta = 123456;
        c1.nome = "XYZ";
        c1.saldo = 1000;
        System.out.println("Saldo:\n"+ c1.saldo);
        System.out.println("Valor a depositar:");
        double v = input.nextDouble();
        c1.depositar(v);
        System.out.println("Saldo:\n"+c1.consultaSaldo());


    }
}
