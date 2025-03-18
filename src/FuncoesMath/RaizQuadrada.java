package FuncoesMath;


import java.util.Scanner;



public class RaizQuadrada {
    public static void main (String [] args){

        Scanner sc =new Scanner(System.in);

        System.out.println("Digite um número");
        double n1;
        n1=sc.nextDouble();


       double raiz = Math.sqrt(n1);

        System.out.println("A raiz quadrada de " +n1+ " é " +raiz) ;

sc.close();
    }

}
