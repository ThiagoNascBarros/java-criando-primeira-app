//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!\n");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        // Média calculada por três notas
        double media = (9.8 + 6.3 + 8.0) / 3;
        // Utilizando printf para formatar as saídas de números com casas decimais
        System.out.printf("Média do Filme: %.2f\n", media);

        // String não é um tipo primitivo no Java, ela é uma classe
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento:
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
        // Casting -  Transformando valores no Java - Double -> Int
        classificacao = (int) media / 2;
        System.out.println(classificacao);

    }
}