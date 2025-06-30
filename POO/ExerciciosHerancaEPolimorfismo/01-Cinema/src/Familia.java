public class Familia extends Ingresso {
    private final double DESCONTO = 0.95;

    private int quantidadeDePessoas;
    public Familia(double valor, String nomeDoFilme, boolean dublado, int quantidadeDePessoas) {
        super(valor, nomeDoFilme, dublado);
        this.quantidadeDePessoas = quantidadeDePessoas;
    }

    @Override
    public double getValor() {
        if (this.quantidadeDePessoas > 3) {
            return super.getValor() * quantidadeDePessoas * DESCONTO;
        }
        return super.getValor() * quantidadeDePessoas;
    }
}
