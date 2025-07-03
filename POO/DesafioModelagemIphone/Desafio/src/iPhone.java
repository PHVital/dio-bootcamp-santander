public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    // Implementação dos métodos do ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA...");
    }

    @Override
    public void pausar() {
        System.out.println("MÚSICA PAUSADA.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // Implementação dos métodos do AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO CHAMADA.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ.");
    }

    // Implementação dos métodos do NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página da web: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA NO NAVEGADOR.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA.");
    }
}
