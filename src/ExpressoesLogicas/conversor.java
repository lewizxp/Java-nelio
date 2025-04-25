package ExpressoesLogicas;
import java.util.Scanner;



public class conversor {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em celcius vou converter em Fahrenheit");
        double celcius = sc.nextDouble();

        double formula = (celcius * 9 / 5) + 32;
        System.out.println("Sua temperatura em Fahrenheit é " + formula);


        if (formula < 15) {
            System.out.println("Está frio");
        }
        else if(formula >=15 && formula <=30) {
            System.out.println("Está um clima agradável");
        }
         else if (formula > 30) {
            System.out.println("Está quente");
        }
         else{
            System.out.println("temperatura ínválida");
        }


            sc.close();

        }
    }

