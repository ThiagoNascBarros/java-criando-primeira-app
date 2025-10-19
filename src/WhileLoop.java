import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double avaliacao = 0;
        int totalDeNotas = 0;

        while (avaliacao != -1) {
            System.out.print("Diga sua avaliação para o filme: ");
            avaliacao = ler.nextDouble();

            if (avaliacao != -1) {
                mediaAvaliacao += avaliacao;
                totalDeNotas++;
            }
        }

        System.out.println("Média da avaliação: " + mediaAvaliacao / totalDeNotas);
    }

}
