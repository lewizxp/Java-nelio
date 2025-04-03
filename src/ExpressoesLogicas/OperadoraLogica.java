package ExpressoesLogicas;
import java.util.Scanner;
import java.util.Locale;

public class OperadoraLogica {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o número de minutos usados");
        Locale.setDefault(Locale.US);
        int n1 = sc.nextInt();

        double conta = 50.0;

        if(n1 > 100){
         conta += (n1-100)*2;
        }
        System.out.printf(" O pagamento da conta é = R$ %.2f%n" , conta);
        sc.close();

    }
}
