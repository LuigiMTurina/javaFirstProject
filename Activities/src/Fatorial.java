import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int num = 0;
        int fat = 1;

        System.out.println("Digite um número");
        num = sc.nextInt();

        for (i = num; i > 0; i--) {
            fat *= i;
        }

        System.out.printf("O fatorial de %d é igual a: %d", num, fat);
    }
}
