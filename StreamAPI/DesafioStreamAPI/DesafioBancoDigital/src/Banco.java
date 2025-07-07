import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<Conta>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void removerConta(Conta conta) {
        this.contas.remove(conta);
    }

    public void exibirContas() {
        System.out.println("=== Contas no Banco " + this.nome + " ===");
        for (Conta conta : this.contas) {
            System.out.println("Número: " + conta.getNumero() + ", Titular: " + conta.cliente.getNome());
        }
    }
}
