import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto arroz = new Alimentacao("Arroz 5kg", 25.00);
        Produto camisa = new Vestuario("Camisa social", 150.00);
        Produto sabonete = new SaudeEBemEstar("Sabonete liquido", 10.00);
        Produto ingresso = new Cultura("Ingresso para o cinema", 20.00);

        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(arroz);
        produtos.add(camisa);
        produtos.add(sabonete);
        produtos.add(ingresso);

        CalcularTributos calculadora = new CalcularTributos();
        calculadora.exibirTributos(produtos);
    }
}