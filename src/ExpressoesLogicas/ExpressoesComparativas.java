package ExpressoesLogicas;

import java.util.Scanner;

java.util.Scanner;

public class ExpressoesComparativas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número ");
        double n1 = sc.nextDouble();

        System.out.println("Digite oo segundo número");
        double n2 = sc.nextDouble();

        boolean iguais = (n1 == n2);
        boolean maior = (n1 > n2);
        boolean menor = (n1 < n2);

        if (iguais) {
            System.out.println("O número " + n1 + " é igual ao " + n2);
        } else if (maior) {
            System.out.println(" esse número é maior ");
        } else {
            System.out.println("esse número é menor");
        }
        sc.close();
    }
}
