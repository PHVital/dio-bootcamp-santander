public class SaudeEBemEstar extends Produto {
    private static final double TAXA_IMPOSTO = 0.015;

    public SaudeEBemEstar(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularValorComImposto() {
        double imposto = this.valor * TAXA_IMPOSTO;
        return this.valor + imposto;
    }
}
