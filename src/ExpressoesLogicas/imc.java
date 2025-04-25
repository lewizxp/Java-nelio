package ExpressoesLogicas;
import java.util.Locale;
import java.util.Scanner;


public class imc {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite sue peso em kg");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura em metros");
        double altura = sc.nextDouble();

        double imc = peso / (altura *altura);

        System.out.println("Seu IMC É " +imc);

        if( imc <=18.5){
            System.out.println("Você está abaixo do peso");
        } else if (imc >=18.5 && imc <= 24.9) {
            System.out.println("Você está com o peso ideal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Você está com sobrepeso");
        }  else if ( imc >= 30 && imc <= 34.9 ) {
            System.out.println(" Você está com obesidade nível 1");
        } else if (imc >= 35 && imc <39.9) {
            System.out.println("Você está com obesidade nível 2");
        } else  {
            System.out.println("Você está com obesidade nível 3");
        }

        sc.close();
    }
}
