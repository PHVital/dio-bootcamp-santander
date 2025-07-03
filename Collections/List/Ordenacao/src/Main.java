public class Main {
    public static void main(String[] args) {
        OrdenacaoDeNumeros ord = new OrdenacaoDeNumeros();
        ord.adicionarNumero(5);
        ord.adicionarNumero(3);
        ord.adicionarNumero(10);
        System.out.println(ord.ordenarDescendente());
    }
}