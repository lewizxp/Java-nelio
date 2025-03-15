package PrimeirosPassos;
import java.util.Locale;
import java.util.Scanner;
public class
entradadados {

    public static void main (String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner  (System.in);


        double n1 ;
        double n2;
        n1 = sc.nextDouble();
        n2 = sc.nextDouble ();
        double soma = n1 +n2;
        System.out.println("o resultado de "+n1+ " + " +n2+ " é " +soma );


        sc.close ();
    }
}
