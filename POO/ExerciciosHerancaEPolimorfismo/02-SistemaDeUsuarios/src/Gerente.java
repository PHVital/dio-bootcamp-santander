public class Gerente extends Usuario {
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println(this.getNome() + " gerou um relatório financeiro.");
    }

    public void consultarVendas() {
        System.out.println(this.getNome() + " consultou as vendas gerais.");
    }
}
