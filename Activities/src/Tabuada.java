import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        System.out.println("Escolha um número");
        int num = sc.nextInt();

        System.out.printf("------- Tabuada do %d ------\n", num);

        for (i = 0; i < 10; i++) {
            System.out.printf("%d X %d = %d\n", num, i + 1, num * (i + 1));
        }
    }
}
