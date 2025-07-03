public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.exibirItens();

        carrinho.adicionarItem("Pao", 0.50, 5);
        carrinho.adicionarItem("Pao", 0.50, 5);
        carrinho.adicionarItem("Manteiga", 5.00, 1);

        carrinho.exibirItens();

        System.out.println("O valor total é R$" + carrinho.calcularValorTotal());

        carrinho.removerItem("Pao");

        carrinho.exibirItens();
    }
}
