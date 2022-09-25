package AulaQuatro;

public class ClassedaThread extends Thread{

    public void run (){
        int vet[] = new int[100];
        int i, somaTotal = 0, somaUm = 0, somaDois =0;

        for (i=0;i<vet.length/2;i++){
            System.out.printf("\n%d", i);
            somaUm += i;
        }

        for (i =50; i<vet.length; i++){
            System.out.printf("\n%d", i);
            somaDois += i;
        }

        somaTotal = somaUm+somaDois;
        System.out.println("\n\nSoma: "+somaTotal);
    }

}
