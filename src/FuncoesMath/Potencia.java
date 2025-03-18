package FuncoesMath;
import java.util.Scanner;



public class Potencia{

    public static void main (String[] args){

        Scanner sc =new Scanner(System.in);

        System.out.println("Digite a base da potência ");
        double base;
        base = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite um expoente");
        double expoente;
        expoente = sc.nextDouble();

      double resultado=  Math.pow(base, expoente);

        System.out.println("A potência de " +base+ " com expoente " +expoente+" da o resultado de "+resultado
        );



sc.close();
    }
}
