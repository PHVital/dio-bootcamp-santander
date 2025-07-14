package dio.fixando_conteudo.service;

import dio.fixando_conteudo.RemetenteConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private final RemetenteConfig config;

    @Autowired
    public EmailService(RemetenteConfig config) {
        this.config = config;
    }

    public void enviarEmailBoasVindas(String destinatario) {
        System.out.println("De: " + config.nome() + " <" + config.email() + ">");
        System.out.println("Para: " + destinatario);
        System.out.println("Assunto: Bem-vindo!");
    }
}
