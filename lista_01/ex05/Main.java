package lista_01.ex05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o saldo atual da conta: ");
        double saldoAtual = sc.nextDouble();

        ContaCorrente conta = new ContaCorrente(saldoAtual);

        System.out.printf("Saldo atual: %.2f%n", conta.getSaldo());

        //Depósito
        System.out.println("Digite o valor a depositar: ");
        double valorDeposito = sc.nextDouble();
        conta.registrarDeposito(valorDeposito);
        System.out.printf("Saldo após o depósito: %.2f%n", conta.getSaldo());

        //Saque
        System.out.println("Digite o valor a sacar: ");
        double valorSaque = sc.nextDouble();
        conta.registrarSaque(valorSaque);
        System.out.printf("Saldo: %.2f%n", conta.getSaldo());

        sc.close();
    }
}
