package FuncoesMath;
import java.util.Scanner;

public class Absoluto {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Digite um angulo");

       double angulo = sc.nextDouble();

         double cos = Math.cos(angulo);
         double seno = Math.sin(angulo);
         double tan = Math.tan(angulo);


        System.out.printf("cos: %.4f\n",cos);
        System.out.printf("seno: %.4f\n", seno);
        System.out.printf("tangente: %.4f\n", tan);
        sc.close();
    }
}
