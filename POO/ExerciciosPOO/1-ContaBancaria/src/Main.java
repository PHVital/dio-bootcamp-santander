public class Main {
    public static void main(String[] args) {
        System.out.println("--- BEM-VINDO AO BANCO DIGITAL ---\n");

        // --- Fase 1: Criação das Contas ---
        System.out.println("--- Criando contas ---");
        // Conta com depósito inicial baixo, resultando em cheque especial de R$50
        Conta contaDoPedro = new Conta("12345-6", 200.00);
        System.out.println("Conta do Pedro criada com saldo inicial de R$200.00");
        contaDoPedro.consultarChequeEspecial();

        System.out.println();

        // Conta com depósito inicial alto, resultando em cheque especial de 50%
        Conta contaDaMaria = new Conta("78910-1", 1000.00);
        System.out.println("Conta da Maria criada com saldo inicial de R$1000.00");
        contaDaMaria.consultarChequeEspecial();
        System.out.println("----------------------------------------\n");


        // --- Fase 2: Operações na Conta do Pedro ---
        System.out.println("--- Testando a Conta do Pedro ---");
        System.out.println("Saldo atual: R$" + contaDoPedro.getSaldo());

        // Saque que força o uso do cheque especial
        System.out.println("\nTentando sacar R$220.00...");
        contaDoPedro.sacar(220.00);

        // Verificando o estado da conta após usar o cheque especial
        System.out.println("A conta está usando cheque especial? " + contaDoPedro.estaUsandoChequeEspecial());
        System.out.println("\n");

        // --- Fase 3: Quitand_o a Dívida ---
        System.out.println("--- Tentando quitar a dívida do cheque especial ---");
        // A dívida é de 20 * 1.20 = R$24.00
        // Primeiro, um depósito parcial
        contaDoPedro.depositar(15.00);

        System.out.println();

        // Agora, um depósito que quita a dívida e ainda sobra
        contaDoPedro.depositar(50.00);
        System.out.println("A conta ainda está usando cheque especial? " + contaDoPedro.estaUsandoChequeEspecial());
        System.out.println("----------------------------------------\n");
    }
}