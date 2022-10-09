package AulaSete;

public class FolhaPagto {
    public static void main(String[] args) {
        HoristaTwo h2 = new HoristaTwo("Lucia", "Alcantara", 101, 80, 40);
        h2.calcSalario();
        System.out.println("\nDados do funcionário. ");
        System.out.println(h2.toString());

        Mensalidade m1 = new Mensalidade("Rosinel", "Aparecido", 102, 3500);
        m1.calcSalario(0);
        System.out.println("\nDados do funcionário.");
        System.out.println(m1.toString());

        Mensalidade m2 = new Mensalidade("Rafane", "Aparecido", 103, 3500);
        m2.calcSalario(5);
        System.out.println("\nDados do funcionário.");
        System.out.println(m2.toString());
    }
}
