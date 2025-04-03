package ExpressoesLogicas;
import java.util.Scanner;

    public class vota {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite sua  idade");
            int idade = sc.nextInt();

            if (idade >= 18) {
                System.out.println("Você pode votar");
            } else {
                System.out.println("Você não pode votar");
            }
        }
    }
