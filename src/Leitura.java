import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome do seu filme favorito: ");
        String filme = ler.nextLine();

        System.out.print("Qual o ano de lançamento? ");
        int anoDeLancamento = ler.nextInt();

        System.out.print("Diga sua avaliação para o filme: ");
        double avaliacao = ler.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }

}
