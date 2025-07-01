import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SMS sms = new SMS();
        Email email = new Email();
        RedesSociais redesSociais = new RedesSociais();
        WhatsApp whatsApp = new WhatsApp();

        List<Mensagem> canaisDeEnvio = new ArrayList<>();
        canaisDeEnvio.add(sms);
        canaisDeEnvio.add(email);
        canaisDeEnvio.add(redesSociais);
        canaisDeEnvio.add(whatsApp);

        String mensagemPromocional = "Aproveite! 50% de desconto em todos os produtos!";

        CampanhaDeMarketing campanhaDeNatal = new CampanhaDeMarketing();
        campanhaDeNatal.enviarParaTodosOsCanais(mensagemPromocional, canaisDeEnvio);
    }
}