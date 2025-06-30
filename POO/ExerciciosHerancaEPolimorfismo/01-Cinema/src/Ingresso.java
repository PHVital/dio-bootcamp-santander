public abstract class Ingresso {
    private double valor;
    private String nomeDoFilme;
    private boolean dublado;

    public Ingresso(double valor, String nomeDoFilme, boolean dublado) {
        this.valor = valor;
        this.nomeDoFilme = nomeDoFilme;
        this.dublado = dublado;
    }

    public double getValor() {
        return valor;
    }
}
