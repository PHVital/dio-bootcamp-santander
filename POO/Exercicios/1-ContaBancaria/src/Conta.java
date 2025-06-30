public class Conta {
    private double saldo;
    private final String numeroConta;
    private final double limiteChequeEspecial;
    private double chequeEspecialDisponivel;
    private double dividaChequeEspecial;

    public Conta(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        this.limiteChequeEspecial = saldoInicial <= 500 ? 50 : saldoInicial * 0.5;
        this.chequeEspecialDisponivel = limiteChequeEspecial;
        this.dividaChequeEspecial = 0.0;
    }

    // MÉTODOS DE CONSULTA

    public double getSaldo() {
        return this.saldo;
    }

    public void consultarChequeEspecial() {
        System.out.println("Limite total do Cheque Especial: R$" + this.limiteChequeEspecial);
        System.out.println("Cheque Especial disponivel: R$" + this.chequeEspecialDisponivel);
        System.out.println("Divida atual do Cheque Especial (com taxa) R$" + this.dividaChequeEspecial);
    }

    public boolean estaUsandoChequeEspecial() {
        return this.saldo < 0;
    }

    // MÉTODOS DE OPERAÇÃO

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }

        System.out.println("Depositando R$" + valor + " ...");

        if (this.dividaChequeEspecial > 0) {
            double valorAposQuitar = valor - this.dividaChequeEspecial;

            if (valorAposQuitar >= 0) {
                System.out.println("Divida de R$" + this.dividaChequeEspecial + " foi quitada!");
                this.saldo += this.dividaChequeEspecial;
                this.dividaChequeEspecial = 0.0;
                this.chequeEspecialDisponivel = this.limiteChequeEspecial;
                this.saldo += valorAposQuitar;
            } else {
                this.saldo += valor;
                this.dividaChequeEspecial -= valor;
                System.out.println("Pagamento parcial da dívida do cheque especial. Dívida restante: R$" + this.dividaChequeEspecial);
            }
        } else {
            this.saldo += valor;
        }

        System.out.println("Operação finalizada. Saldo atual: R$" + this.saldo);
        consultarChequeEspecial();
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return;
        }

        double saldoTotalDisponivel = this.saldo + this.chequeEspecialDisponivel;

        if (valor > saldoTotalDisponivel) {
            System.out.println("Saque não realizado. Saldo e limite de Cheque Especial insuficientes.");
            return;
        }

        this.saldo -= valor;

        if (this.saldo < 0) {
            double valorUtilizadoDoCheque = -this.saldo;
            this.saldo = 0;
            this.chequeEspecialDisponivel -= valorUtilizadoDoCheque;
            this.dividaChequeEspecial = valorUtilizadoDoCheque * 1.2;
            System.out.println("Você utilizou R$" + valorUtilizadoDoCheque + " do Cheque Especial.");
        }
        System.out.println("Saque realizado. Saldo disponivel: R$" + this.saldo);
        consultarChequeEspecial();
    }

    public void pagarBoleto(double valor) {
        System.out.println("--- Tentando pagar boleto R$" + valor + " ---");
        sacar(valor);
    }
}
