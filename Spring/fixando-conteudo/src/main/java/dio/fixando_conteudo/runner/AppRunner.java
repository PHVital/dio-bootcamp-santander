package dio.fixando_conteudo.runner;

import dio.fixando_conteudo.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {
    private final EmailService emailService;

    @Autowired
    public AppRunner(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- TESTANDO SERVIÇO DE EMAIL ---");
        emailService.enviarEmailBoasVindas("novo.usuario@email.com");
    }
}
