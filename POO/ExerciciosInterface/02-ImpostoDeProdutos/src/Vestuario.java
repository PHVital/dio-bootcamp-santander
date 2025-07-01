public class Vestuario extends Produto {
    private static final double TAXA_IMPOSTO = 0.025;

    public Vestuario(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularValorComImposto() {
        double imposto = this.valor * TAXA_IMPOSTO;
        return this.valor + imposto;
    }
}
