import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = new Random().nextInt(100);
        int tentativas = 5;
        int palpite = 0;

        System.out.println("Faça um palpite. Você tem 5 tentativas");

        while (palpite != valor) {
            palpite = sc.nextInt();

            if (palpite != valor) {
                if (palpite > valor) {
                    System.out.println("Errado! O número é menor");
                    tentativas--;
                    System.out.printf("\nTente novamente. %d tentativas restantes\n", tentativas);
                } else {
                    System.out.println("Errado! O número é maior");
                    tentativas--;
                    System.out.printf("\nTente novamente. %d tentativas restantes\n", tentativas);
                }
                if (tentativas == 0) {
                    System.out.printf("\nAcabou! As tentativas acabaram. O número era %d", valor);
                    break;
                }
            } else {
                System.out.println("Parabéns! Você acertou");
                break;
            }
        }
    }
}