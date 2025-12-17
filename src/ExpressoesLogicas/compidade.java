package ExpressoesLogicas;
import java.util.Scanner;

public class compidade {
    public static void main (String [] args ){
     Scanner sc= new Scanner(System.in);
        System.out.printf("Digite a sua idade ");
        int idade = sc.nextInt();

        System.out.println("Sua idade é " +idade);

        if(idade >= 20){
            System.out.println("Você é mais velho  ");

        } else if (idade <= 20) {
            System.out.println("Você é um adoslecente ");

        } else if (idade < 0){
            System.out.println("Você não existe " );
        }
    }
}
