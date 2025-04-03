package ExpressoesLogicas;
import java.util.Scanner;
public class Calculadora {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um número");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo número");
        double n2 = sc.nextDouble();

        System.out.println("Digite qual operação vai escolher");
        sc.nextLine();

        String operacao sc.nextLine();
        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao){
            case  "+":
                resultado = n1 +n2 ;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case  "*" :
                resultado = n1 * n2;
                break;
            case "/" :
                if (n2 == 0){
                    System.out.println("Erro :divisão por zero");
                    operacaoValida = false;
                } else {
                    resultado = n1 / n2;
                }
                break;
            default:
                System.out.println("Operação inválida");
                operacaoValida = false;
                break;


        }

        if (operacaoValida){
            System.out.println("Resultado " + resultado) ;
        }
        sc.close();
    }



}
