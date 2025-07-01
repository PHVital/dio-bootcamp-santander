import java.util.List;

public class CampanhaDeMarketing {
    public void enviarParaTodosOsCanais (String textoDaCampanha, List<Mensagem> canais) {
        System.out.println("--- INICIANDO CAMPANHA DE MARKETING ---");
        System.out.println("Mensagem '" + textoDaCampanha + "'");

        for (Mensagem canal : canais) {
            canal.enviarMensagem(textoDaCampanha);
        }

        System.out.println("--- CAMPANHA FINALIZADA ---");
    }
}
