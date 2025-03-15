package PrimeirosPassos;

import java. util.Locale;

public class expressosAri {

    public static void main (String[] args) {

      String nome = "Luiz" ;
      int idade = 21;
      double salario = 6000.0;

        System.out.printf("%s tem %d anos e ganha % 2f reais %n",nome,idade,salario);



        String produto1 = "computador";
        String produto2 = "teclado";

        int idadess = 21;
        int  code = 77888;
        char genero = 'M';
        double price1 = 2100.0;




        double price2 = 650.50;
      Locale defaultLocale = Locale.US;
        double measure = 53.234567;


        System.out.printf("Produtos %n %s , vale %2f %n  , %s , vale %2f %n recorde : %d anos, o codigo é %d  e o genero é %c %n  o nummero com oito  decimos depois da virgula %8f %n  agora com 3 decimmais é assim %.3f %n   "
                , produto1,price1 , produto2, price2,idadess,code,genero , measure,measure);

        System.out.printf("em dolares fica assim %.2f" ,measure) ;


int n1 = 10;
double n2 = 20.0;
double conta = n1 + n2;

        System.out.println( "o resultado é "  + (double) conta);

    }

}

