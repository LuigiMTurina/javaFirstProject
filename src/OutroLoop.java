import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float mediaAvaliacao = 0;
        float nota = 0;
        int contador = 0;

        while (nota != -1) {
            System.out.println("Diga a sua avaliação para o filme ou -1 para encerrar: ");
            nota = sc.nextFloat();

            if (nota != -1) {
                mediaAvaliacao += nota;
                contador++;
            }
        }

        System.out.printf("Média de avaliações: %.2f", mediaAvaliacao/contador);
    }
}
