package ExpressoesLogicas;
import java.util.Scanner;

public class ParImpar {
    public static void main  (String [] args){

        Scanner sc =  new Scanner (System.in);
        System.out.println("Digite um número");

        int n1 = sc.nextInt();

        if(n1 % 2 ==0){

            System.out.println("n1 é par");
        }   else{
            System.out.println("Esse número é ímpar");
        }
        sc.close();
    }

}
