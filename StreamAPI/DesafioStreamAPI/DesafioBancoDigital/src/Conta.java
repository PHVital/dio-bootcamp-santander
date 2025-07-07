public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public boolean sacar(double valor){
        if (valor <= 0) {
            System.out.println("Valor de saque inválido");
            return false;
        }
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");
            return false;
        }

        this.saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado com sucesso");
        return true;
    }

    @Override
    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso");
        } else {
            System.out.println("Valor de depósito invalido");
        }
    }

    @Override
    public void transferir(double valor, IConta contaDestino){
        boolean saqueRealizado = this.sacar(valor);
        if (saqueRealizado) {
            contaDestino.depositar(valor);
            System.out.println("Transferência completada");
        } else {
            System.out.println("Transferência não realizada devido a falha no saque");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
