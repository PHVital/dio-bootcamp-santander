public class Vendedor extends Usuario{
    private int qtdDeVendas;

    public Vendedor(String nome, String email, String senha, int qtdDeVendas) {
        super(nome, email, senha, false);
        this.qtdDeVendas = qtdDeVendas;
    }

    public int getQtdDeVendas() {
        return qtdDeVendas;
    }

    public void setQtdDeVendas(int qtdDeVendas) {
        this.qtdDeVendas = qtdDeVendas;
    }

    public void realizarVenda() {
        this.qtdDeVendas++;
        System.out.println(this.getNome() + " realizou uma venda. Total de vendas: " + this.qtdDeVendas);
    }

    public void consultarVendas() {
        System.out.println(this.getNome() + " consultou suas vendas individuais.");
    }
}
