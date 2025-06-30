public class MeiaEntrada extends Ingresso{
    public MeiaEntrada(double valor, String nomeDoFilme, boolean dublado) {
        super(valor, nomeDoFilme, dublado);
    }

    @Override
    public double getValor() {
        return super.getValor() / 2;
    }
}
