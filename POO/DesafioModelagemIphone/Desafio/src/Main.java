public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        System.out.println("--- USANDO COMO REPRODUTOR MUSICAL ---");
        ReprodutorMusical player = meuIphone;
        meuIphone.selecionarMusica("Stairway to Heaven - Led Zeppelin");
        player.tocar();
        player.pausar();
        System.out.println("-------------------------------------\n");

        System.out.println("--- USANDO COMO APARELHO TELEFÔNICO ---");
        AparelhoTelefonico telefone = meuIphone;
        telefone.ligar("1199999-8888");
        telefone.atender();
        telefone.iniciarCorreioVoz();
        System.out.println("---------------------------------------\n");

        System.out.println("--- USANDO COMO NAVEGADOR DE INTERNET ---");
        NavegadorInternet navegador = meuIphone;
        navegador.exibirPagina("https://www.google.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
        System.out.println("-----------------------------------------\n");
    }
}