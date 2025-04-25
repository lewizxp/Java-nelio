package ExpressoesLogicas;

import java.util.Scanner;
public class media {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Vamos Calcular sua média, mas primeiro vc deve digitar sua nota dos 4 bimestres");

        System.out.println("Digite a Primeira nota ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a Segunda nota ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a Terceira nota ");
        double nota3 = sc.nextDouble();

        System.out.println("Digite a Quarta nota ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4)/4;

        if ( media <=40){
            System.out.println("Você está reprovado ");
        } else if (media >=80) {
            System.out.println("Você está acima da média, APROVADO");

        } else if (media >=60) {
            System.out.println("Você está na média, APROVADO");
        }else{
            System.out.println("Você está está com a nota insuficiente, portanto reprovado");
        }

        sc.close();
    }

}
