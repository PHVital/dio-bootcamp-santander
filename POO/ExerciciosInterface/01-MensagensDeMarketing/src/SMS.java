public class SMS implements Mensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}
