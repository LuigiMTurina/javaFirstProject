import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float mediaAvaliacao = 0;
        float nota;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga a sua avaliação para o filme: ");
            nota = sc.nextFloat();

            mediaAvaliacao += nota;
        }

        System.out.printf("Média de avaliações: %.2f", mediaAvaliacao/3);
    }
}
