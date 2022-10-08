package AulaSete;

public class FolhaPagamento {
    public static void main(String[] args) {
        Horista h1 = new Horista("Ana", "10553",35,20,45);
        h1.calculaSalario();
        System.out.println(h1.toString());
        Integral in1 = new Integral("João","10255", 25,3900);
        in1.setSalario();
        System.out.println(in1.toString());
    }
}
