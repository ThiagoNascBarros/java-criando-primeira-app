import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double avaliacao = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Diga sua avaliação para o filme: ");
            avaliacao = ler.nextDouble();
            mediaAvaliacao += avaliacao;
        }

        System.out.println("Média da avaliação: " + mediaAvaliacao / 3);
    }

}
