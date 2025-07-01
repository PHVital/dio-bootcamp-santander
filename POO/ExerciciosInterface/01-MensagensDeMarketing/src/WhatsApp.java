public class WhatsApp implements Mensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("WhatsApp enviado: " + mensagem);
    }
}
