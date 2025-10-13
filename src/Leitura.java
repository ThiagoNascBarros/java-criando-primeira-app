import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do seu filme favorito: ");
        String filme = ler.nextLine();
        System.out.println(filme);
    }

}
