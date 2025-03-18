package ExpressoesLogicas;
import java.util.Scanner;

public class maiormenor {
    public static void main ( String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número");

        double n1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o segundo número");

        double n2 = sc.nextDouble();

        if(n1>n2){
            System.out.println("O primeiro número digitado é maior que o segundo");

        } else if(n1==n2){
            System.out.println("Esse número é igual portanto não é maior");
        }else {
            System.out.println("O segundo núummero é maior que o primeiro");
        }

        sc.close();
    }
}
