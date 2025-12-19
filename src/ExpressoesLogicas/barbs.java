package ExpressoesLogicas;
import java.util.Scanner;
public class barbs {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- BEM-VINDO À BARBEARIA BARBS ---");
            System.out.println("Escolha o serviço desejado:");
            System.out.println("1 - Corte de Cabelo");
            System.out.println("2 - Barba");
            System.out.println("3 - Combo (Corte + Barba)");
            System.out.println("4 - Sair");

            int opcao = scanner.nextInt();

            // Estrutura Switch Case para processar a escolha
            switch (opcao) {
                case 1:
                    System.out.println("Você selecionou: Corte de Cabelo.");
                    System.out.println("Valor: R$ 40,00");
                    break;
                case 2:
                    System.out.println("Você selecionou: Barba.");
                    System.out.println("Valor: R$ 30,00");
                    break;
                case 3:
                    System.out.println("Você selecionou: Combo.");
                    System.out.println("Valor: R$ 60,00 (Desconto aplicado!)");
                    break;
                case 4:
                    System.out.println("Encerrando sistema... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, tente novamente.");
                    break;
            }

            scanner.close();
        }
    }

