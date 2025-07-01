public class Atendente extends Usuario {
    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha, double valorEmCaixa) {
        super(nome, email, senha, false);
        this.valorEmCaixa = valorEmCaixa;
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void receberPagamento(double valor) {
        this.valorEmCaixa += valor;
        System.out.println(this.getNome() + " recebeu um pagamento. Novo valor em caixa: R$" + this.valorEmCaixa);
    }

    public void fecharCaixa() {
        System.out.println(this.getNome() + " está fechando o caixa com o valor de R$" + this.valorEmCaixa);
        this.valorEmCaixa = 0;
    }
}
