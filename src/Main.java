import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String tipoDaConta = "Corrente", nomeDoCliente = "Thiago";
        double saldo = 9.000;


        System.out.println("*************\n" +
                "Bem-vindo ao BACash(Banco Alura Cash)\n" +
                "Inicialize seus dados para entrar em sua conta\n" +
                "*************\n");
        System.out.println("*************");
        while (true) {
            System.out.println("\n*************");
            System.out.println("Dados iniciais do cliente:");
            System.out.println("Nome: " + nomeDoCliente);
            System.out.println("Tipo conta: " + tipoDaConta);
            System.out.printf("Saldo inicial: %.3f\n", saldo);
            System.out.println("*************\n");
            System.out.println("\nOperações\n1- Consultar saldos\n2- Receber valor\n3- Transferir valor\n4- Sair\n");
            System.out.print("Digite a opção desejada: ");
            int opcao = ler.nextInt();

        }


    }

}
