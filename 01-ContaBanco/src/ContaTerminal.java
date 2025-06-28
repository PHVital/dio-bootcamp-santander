package src.SintaxeBaseJava.Desafio.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Digite a agencia da conta: ");
        String agenciaConta = sc.next();

        sc.nextLine();

        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite seu saldo: ");
        float saldoCliente = sc.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agenciaConta, numeroConta, saldoCliente);
    }
}
