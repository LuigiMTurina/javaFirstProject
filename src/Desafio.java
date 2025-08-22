import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float saldoInicial = 10_000.00F;
        float valor = 0;
        int opcao = 0;

        System.out.println("**********************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.printf("\n");
        System.out.println("Nome:          Luigi Moro Turina");
        System.out.println("Tipo de conta:          Corrente");
        System.out.printf("Saldo Inicial:       R$ %.2f\n", saldoInicial);
        System.out.println("**********************************");

        while (opcao != 4) {
            System.out.printf("\n\nOperações");
            System.out.printf("\n");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Encerrar operações");
            System.out.printf("\n");
            System.out.print("Selecione a operação desejada: ");

            opcao = sc.nextInt();

            while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {
                System.out.print("Opção inválida. Por favor, selecione uma operação válida: ");
                opcao = sc.nextInt();
            }

            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo atual é de RS %.2f", saldoInicial);
                    break;
                case 2:
                    System.out.print("Informe o valor a ser recebido: R$ ");

                    valor = sc.nextFloat();
                    saldoInicial = saldoInicial + valor;

                    System.out.printf("\n\nSeu saldo atual é de R$ %.2f\n\n", saldoInicial);
                    break;
                case 3:
                    System.out.print("Informe o valor a ser transferido: R$ ");

                    valor = sc.nextFloat();

                    if (valor > saldoInicial) {
                        System.out.printf("\n\nVocê não tem saldo suficiente para essa operação\n");
                        break;
                    }

                    saldoInicial = saldoInicial - valor;

                    System.out.printf("\n\nSeu saldo atual é de R$ %.2f", saldoInicial);
                    break;
                case 4:
                    System.out.println("Operações encerradas");
                    break;
            }
        }
    }
}

