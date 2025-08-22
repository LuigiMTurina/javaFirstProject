import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = sc.nextLine();

        System.out.println("QUal é o ano de lançamento?: ");
        short anoDeLancamento = sc.nextShort();

        System.out.println("Diga a sua avaliação para o filme: ");
        float avaliacao = sc.nextFloat();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
