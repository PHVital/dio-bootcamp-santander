public class RedesSociais implements Mensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Redes Sociais enviado: " + mensagem);
    }
}
