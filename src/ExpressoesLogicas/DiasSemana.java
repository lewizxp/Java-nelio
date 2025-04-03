package ExpressoesLogicas;
import java.util.Scanner;
public class DiasSemana {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o dia que vc está da smna em número");

        int  n1 = sc.nextInt();
        String dia;
        switch (n1){
            case 1 :
                dia = "Domingo";
                break;
            case 2 :
                dia = "Segunda";
                break;
            case 3 :
                dia = "Terça";
                break;
            case 4  :
                dia = "Quarta";
                break;
            case 5 :
                dia = "Quinta";
                break;
            case 6 :
                dia =  "Sexta";
                break;
            case 7 :
                dia = "Sabádo";
                break;
            default:
                dia = "Valor ínvalido";
                break;

        }
        System.out.println("DE acordo com o dia que vc digitou ,você está no dia " +dia);
        sc.close();
    }
}
