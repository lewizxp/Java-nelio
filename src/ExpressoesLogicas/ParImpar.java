package ExpressoesLogicas;
import java.util.Scanner;

public class ParImpar {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.printf("Digite um número");
         double n1 = sc.nextDouble();
        if (n1 % 2 == 0) {
            System.out.printf("O número é par");
        } else if (n1 == 0) {
            System.out.printf("O numero é igual a zero");
        }else {
            System.out.printf("Seu número é ímpar");
        }
        sc.close();
    }
}