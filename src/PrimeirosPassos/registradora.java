package PrimeirosPassos;
import java.util.Locale;
import java.util.Scanner;

public class registradora {

    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sal;
        String nome;
        int idade;

        System.out.println("informe seu salario!");
        sal=sc.nextDouble();
        sc.nextLine();

        System.out.println("informe seu nome!");
        nome=sc.nextLine();

        System.out.println("informe sua idade!");
        idade = sc.nextInt();

        System.out.println("O seu nome é " +nome+ " sua idade é " +idade+ " e seu salário é " +sal);
        System.out.println("a primeira letra do seu nome é " +nome.charAt(0));


        sc.close ();
    }
}


