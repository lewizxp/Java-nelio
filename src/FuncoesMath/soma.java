package FuncoesMath;

import java.util.Scanner;

public class soma {

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite umm numero");

        int n1 = sc.nextInt();

        System.out.println("Digite o segundo numero");
        int n2 = sc.nextInt();

        int soma = n1 + n2;

        System.out.println("A soma dos numeros " +n1+" , "+n2+ " é " +soma);

        sc.close();
    }
}
