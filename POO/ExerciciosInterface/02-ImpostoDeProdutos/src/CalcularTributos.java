import java.util.List;

public class CalcularTributos {
    public void exibirTributos(List<Produto> produtos) {
        System.out.println("--- EXIBINDO VALORES FINAIS COM IMPOSTOS ---");

        for (Produto produto : produtos) {
            System.out.printf("Valor final do produto %s : R$ %.2f%n", produto.getNome(), produto.calcularValorComImposto());
        }

        System.out.println("--- CALCULO FINALIZADO ---");
    }
}
