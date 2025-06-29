public class Main {
    public static void main(String[] args) {
        var cliente = new Conta("123456", 5000);
        System.out.println("O cliente tem R$" + cliente.getSaldo() + " na conta");
        cliente.depositar(100);
        cliente.sacar(200);
        cliente.pagarBoleto(1000);
    }
}