package ExpressoesLogicas;
import java.util.Scanner;


public class EstruturaCondi {

    public  static void main (String[] args){
Scanner sc = new Scanner  (System.in);
        System.out.println("Digite um número");

        int n1 = sc.nextInt();


if (n1>0){
    System.out.println("n1 é positivo");
} else if(n1<0){

    System.out.println("n1 é negativo");
}else {

    System.out.println("Esse número é zero");
}
sc.close();
    }
}
