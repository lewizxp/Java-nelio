package ExpressoesLogicas;
import java.util.Scanner;


public class Switchcase {
    public static void main (String [] args ){
        Scanner sc = new Scanner (System.in);
        int dia = sc.nextInt();
        switch (dia) {
            case 1:
              System.out.printf("Domingo");
              break;
            case 2 :
                System.out.printf("Segunda");
               break;
            case 3 :
                System.out.printf("Terça");
                break;
            case 4 :
                System.out.printf("Quarta");
                break;
            case 5 :
                System.out.printf("Quinta");
                break;
            case 6 :
                System.out.printf("sexta");
                break;
            case 7 :
                System.out.printf("Sábado");
                break;
            default:
                System.out.printf("Dia inválido");



        }
     sc.close();
    }

}
