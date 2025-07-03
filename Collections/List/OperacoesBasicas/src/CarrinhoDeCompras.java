import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaDeCompras;

    public CarrinhoDeCompras() {
        this.listaDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> listaParaRemover = new ArrayList<>();
        for (Item item : listaDeCompras) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                listaParaRemover.add(item);
            }
        }
        listaDeCompras.removeAll(listaParaRemover);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : listaDeCompras) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        System.out.println(listaDeCompras);
    }
}
